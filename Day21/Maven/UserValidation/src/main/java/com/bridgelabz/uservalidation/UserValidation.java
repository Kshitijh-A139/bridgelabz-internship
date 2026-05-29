package com.bridgelabz.uservalidation;

public class UserValidation {

    IUserValidation firstNameValidator = firstName -> firstName.matches("^[A-Z][a-z]{2,}$");

    IUserValidation lastNameValidator = lastName -> lastName.matches("^[A-Z][a-z]{2,}$");

    IUserValidation emailValidator = email -> email.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$");

    IUserValidation phoneValidator = phone -> phone.matches("^[0-9]{2}\\s[6789][0-9]{9}$");

    IUserValidation passwordRule1Validator = password -> password.matches("^.{8,}$");

    IUserValidation passwordRule2Validator = password -> password.matches("^(?=.*[A-Z]).{8,}$");

    IUserValidation passwordRule3Validator = password -> password.matches("^(?=.*[A-Z])(?=.*[0-9]).{8,}$");

    IUserValidation passwordRule4Validator = password -> password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*!]*[@#$%^&*!][^@#$%^&*!]*$).{8,}$");

    public boolean isValidFirstName(String firstName) throws UserValidationException {
        if (firstNameValidator.validate(firstName)) {
            return true;
        }
        throw new UserValidationException("Invalid First Name");
    }

    public boolean isValidLastName(String lastName) throws UserValidationException {
        if (lastNameValidator.validate(lastName)) {
            return true;
        }
        throw new UserValidationException("Invalid Last Name");
    }

    public boolean isValidEmail(String email) throws UserValidationException {
        if (emailValidator.validate(email)) {
            return true;
        }
        throw new UserValidationException("Invalid Email");
    }

    public boolean isValidPhoneNumber(String phone) throws UserValidationException {
        if (phoneValidator.validate(phone)) {
            return true;
        }
        throw new UserValidationException("Invalid Phone Number");
    }

    public boolean isValidPasswordRule1(String password) throws UserValidationException {
        if (passwordRule1Validator.validate(password)) {
            return true;
        }
        throw new UserValidationException("Password should contain minimum 8 characters");
    }

    public boolean isValidPasswordRule2(String password) throws UserValidationException {
        if (passwordRule2Validator.validate(password)) {
            return true;
        }
        throw new UserValidationException("Password should contain at least 1 uppercase");
    }

    public boolean isValidPasswordRule3(String password) throws UserValidationException {
        if (passwordRule3Validator.validate(password)) {
            return true;
        }
        throw new UserValidationException("Password should contain at least 1 digit");
    }

    public boolean isValidPasswordRule4(String password) throws UserValidationException {
        if (passwordRule4Validator.validate(password)) {
            return true;
        }
        throw new UserValidationException("Password should contain exactly 1 special character");
    }

    public boolean validateSampleEmails(String email) throws UserValidationException {
        if (emailValidator.validate(email)) {
            return true;
        }
        throw new UserValidationException("Invalid Sample Email");
    }
}
