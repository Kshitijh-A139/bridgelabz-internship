package com.bridgelabz.userregistration;

public class UserRegistration {

    public boolean isValidFirstName(String firstName) throws UserRegistrationException {
        if (firstName.matches("^[A-Z][a-z]{2,}$")) {
            return true;
        }
        throw new UserRegistrationException("Invalid First Name");
    }

    public boolean isValidLastName(String lastName) throws UserRegistrationException {
        if (lastName.matches("^[A-Z][a-z]{2,}$")) {
            return true;
        }
        throw new UserRegistrationException("Invalid Last Name");
    }

    public boolean isValidEmail(String email) throws UserRegistrationException {
        if (email.matches("^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z]+\\.[a-zA-Z]+(\\.[a-zA-Z]+)?$")) {
            return true;
        }
        throw new UserRegistrationException("Invalid Email");
    }

    public boolean isValidPhoneNumber(String phone) throws UserRegistrationException {
        if (phone.matches("^[0-9]{2}\\s[6789][0-9]{9}$")) {
            return true;
        }
        throw new UserRegistrationException("Invalid Phone Number");
    }

    public boolean hasMinimumEightCharacters(String password) throws UserRegistrationException {
        if (password.matches("^.{8,}$")) {
            return true;
        }
        throw new UserRegistrationException("Password must contain minimum 8 characters");
    }

    public boolean hasMinimumEightCharactersAndOneUpperCase(String password) throws UserRegistrationException {
        if (password.matches("^(?=.*[A-Z]).{8,}$")) {
            return true;
        }
        throw new UserRegistrationException("Password must contain minimum 8 characters and 1 uppercase letter");
    }

    public boolean hasMinimumEightCharactersAndOneDigit(String password) throws UserRegistrationException {
        if (password.matches("^(?=.*[0-9]).{8,}$")) {
            return true;
        }
        throw new UserRegistrationException("Password must contain minimum 8 characters and 1 digit");
    }

    public boolean hasMinimumEightCharactersAndOneSpecialCharacter(String password) throws UserRegistrationException {
        if (password.matches("^(?=.*[@#$%^&+=!]).{8,}$")) {
            return true;
        }
        throw new UserRegistrationException("Password must contain minimum 8 characters and 1 special character");
    }

    public boolean isStrongPassword(String password) throws UserRegistrationException {
        if (password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,}$")) {
            return true;
        }
        throw new UserRegistrationException("Invalid Strong Password");
    }

    public boolean isSampleEmailValid(String email) throws UserRegistrationException {
        if (email.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$")) {
            return true;
        }
        throw new UserRegistrationException("Invalid Sample Email");
    }
}