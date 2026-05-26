package javaregex;

public class UserRegistration {

    public boolean isValidFirstName(String firstName) {
        return firstName.matches("^[A-Z][a-z]{2,}$");
    }

    public boolean isValidLastName(String lastName) {
        return lastName.matches("^[A-Z][a-z]{2,}$");
    }

    public boolean isValidEmail(String email) {
        return email.matches("^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z]+\\.[a-zA-Z]+(\\.[a-zA-Z]+)?$");
    }

    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("^[0-9]{2}\\s[0-9]{10}$");
    }

    public boolean hasMinimumEightCharacters(String password) {
        return password.matches("^.{8,}$");
    }

    public boolean hasMinimumEightCharactersAndOneUpperCase(String password) {
        return password.matches("^(?=.*[A-Z]).{8,}$");
    }

    public boolean hasMinimumEightCharactersAndOneDigit(String password) {
        return password.matches("^(?=.*[0-9]).{8,}$");
    }

    public boolean hasMinimumEightCharactersAndOneSpecialCharacter(String password) {
        return password.matches("^(?=.*[@#$%^&+=!]).{8,}$");
    }

    public boolean isStrongPassword(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,}$");
    }

    public boolean isSampleEmailValid(String email) {
        return email.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$");
    }
}