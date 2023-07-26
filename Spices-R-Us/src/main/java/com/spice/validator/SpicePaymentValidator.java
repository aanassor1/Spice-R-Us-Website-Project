package com.spice.validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.spice.model.SpicePayment;
import com.spice.repo.PaymentRepository;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Validator for payments.
 */
public class SpicePaymentValidator implements Validator {

    PaymentRepository paymentRepo;

    public SpicePaymentValidator(PaymentRepository paymentRepo) {
        this.paymentRepo = paymentRepo;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return SpicePayment.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        SpicePayment p = (SpicePayment) target;

        // Reject card number if it contains any characters that aren't numbers
        if (!(p.getCardNumber().matches("^[0-9]*$"))) {
            errors.rejectValue("cardNumber", "", "Card Number must only contain numbers");
        }

        // Reject card number if its length is not exactly 16 digits.
        if (p.getCardNumber().length() != 16) {
            errors.rejectValue("cardNumber", "", "Card Number must be 16 digits");
        }

        // Reject CVV if it contains any characters that aren't numbers.
        if (!(p.getCVV().matches("^[0-9]*$"))) {
            errors.rejectValue("CVV", "", "CVV must only contain numbers");
        }

        // Reject CVV if its length is not exactly 3 digits.
        if (p.getCVV().length() != 3) {
            errors.rejectValue("CVV", "", "CVV must be 3 digits");
        }

        // Reject expiry date if its format is not as mm/yy.
        if (!(p.getExpDate().matches("(?:0[1-9]|1[0-2])/[0-9]{2}"))) {
            errors.rejectValue("expDate", "", "Expiry Date must be in the format mm/yy");
        }

        SimpleDateFormat sdf = new SimpleDateFormat("MM/yy");
        
        // Reject expiry date if card expiry date is before current date.
        try {
            Date currentDate = sdf.parse(sdf.format(Calendar.getInstance().getTime()));
            
            if (sdf.parse(p.getExpDate()).before(currentDate)) {
                errors.rejectValue("expDate", "", "Card has Expired");
            }

        } catch (ParseException e) {

        }

        // Reject Address Line 1 if it is blank.
        if(p.getAddressL1().isBlank()) {
            errors.rejectValue("addressL1", "", "Address Line 1 must not be empty");
        }

        // Reject City if it is blank.
        if(p.getCity().isBlank()) {
            errors.rejectValue("city", "", "City must not be empty");
        }

        // Reject County if it is blank
        if(p.getCounty().isBlank()) {
            errors.rejectValue("county", "", "County must not be empty");
        }

        // Reject Postcode if it does not match standard postcode conventions.
        if(!(p.getPostcode().toUpperCase().matches("^[A-Z]{1,2}[0-9]{1,2}[A-Z]?(\\s*[0-9][A-Z]{1,2})?$"))) {
            errors.rejectValue("postcode", "", "Postcode must be in a valid format");
        }

        if (errors.hasErrors()) {
            errors.rejectValue("error", "", "Some details are incorrect. Please try again.");
        }

    }
}
