package com.spice.validator;

import java.util.Collection;

import com.spice.model.SpiceUser;
import com.spice.repo.UserRepository;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class SpiceMembershipValidator implements Validator{
    
    UserRepository repo;
    private Collection<? extends GrantedAuthority> user_roles;

    public SpiceMembershipValidator(UserRepository repo, Collection<? extends GrantedAuthority> user_roles) {
        this.repo = repo;
        this.user_roles = user_roles;
    }

    @Override
	public boolean supports(Class<?> clazz) {
		return SpiceUser.class.equals(clazz);
	}

    @Override
    public void validate(Object object, Errors errors) {


        String role_homecook = "ROLE_HOMECOOK";
        String role_enthusiast = "ROLE_ENTHUSIAST";
        String role_business = "ROLE_BUSINESS";

        if(user_roles.toString().contains(role_homecook) || user_roles.toString().contains(role_enthusiast) || user_roles.toString().contains(role_business)) {
            if(user_roles.toArray()[user_roles.toArray().length - 1] == role_homecook) {
                errors.rejectValue("membership_error", "", "You are already a home-cook member");
            } else if(user_roles.toArray()[user_roles.toArray().length - 1] == role_enthusiast) {
                errors.rejectValue("membership_error", "", "You are already an enthusiast member");
            } else if(user_roles.toArray()[user_roles.toArray().length - 1] == role_business) {
                errors.rejectValue("membership_error", "", "You are already a small restaurant member");
            }
        }
    }
}
