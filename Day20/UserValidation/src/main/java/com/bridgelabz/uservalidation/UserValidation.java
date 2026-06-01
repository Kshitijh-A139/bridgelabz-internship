package com.bridgelabz.uservalidation;

public class UserValidation {

    public boolean isValidFirstName(String firstName) {
        return firstName.matches("^[A-Z][a-z]{2,}$");
    }

    public boolean isValidLastName(String lastName) {
        return lastName.matches("^[A-Z][a-z]{2,}$");
    }

    public boolean isValidEmail(String email) {
        return email.matches(
                "^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z]+\\.[a-zA-Z]+(\\.[a-zA-Z]+)?$");
    }

    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("^[0-9]{2}\\s[6789][0-9]{9}$");
    }

    // UC5
    public boolean isValidPasswordRule1(String password) {
        return password.matches("^.{8,}$");
    }

    // UC6
    public boolean isValidPasswordRule2(String password) {
        return password.matches("^(?=.*[A-Z]).{8,}$");
    }

    // UC7
    public boolean isValidPasswordRule3(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*[0-9]).{8,}$");
    }

    // UC8
    public boolean isValidPasswordRule4(String password) {
        return password.matches(
                "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,}$");
    }

    // UC9
    public boolean isSampleEmailValid(String email) {
        return email.matches(
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$");
    }
}