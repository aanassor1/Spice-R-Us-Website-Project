package com.spice.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.spice.model.SpiceUser;
import com.spice.repo.UserRepository;

/**
 * Validator for users.
 */
public class SpiceUserValidator implements Validator {

	UserRepository userRepo;

	public SpiceUserValidator(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

	private Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-+]+(.[_A-Za-z0-9-]+)*@" 
    + "[A-Za-z0-9-]+(.[A-Za-z0-9]+)*(.[A-Za-z]{2,})$"; 
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=?!_])(?=\\S+$).{8,}$";

	@Override
	public boolean supports(Class<?> clazz) {
		return SpiceUser.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		SpiceUser u = (SpiceUser) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "", "Username cannot be empty or contain spaces!");

		if(u.getUsername().length() < 8 || u.getUsername().length() > 256) {
			errors.rejectValue("username", "", "Username must be between 8 and 256 characters in length!");
		}

		if(userRepo.findByUsername(u.getUsername()).isPresent()) {
			errors.rejectValue("username", "", "This username already exists!");
		}

		String email = u.getEmail();
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);

		if(!matcher.matches()) {
			errors.rejectValue("email", "", "Email format invalid!");
		}

		if(userRepo.findByEmail(email).isPresent()) {
			errors.rejectValue("email", "", "Email address already in use!");
		}

		String password = u.getPassword();
        pattern = Pattern.compile(PASSWORD_PATTERN);
		
		if(!pattern.matcher(password).matches()) {
			errors.rejectValue("password", "", "Need a stronger password!");
		}

		if(!u.getPassword().equals(u.getConfirmPassword())) {
			errors.rejectValue("confirmPassword", "", "Confirm password doesn't match!");
		}

	}

}
