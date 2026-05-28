package com.bridgelabz.userregistration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UserRegistrationTest {

    @Test
    void isValidFirstName() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidFirstName("Kshitijh");
        assertEquals(true, result);
    }

    @Test
    void isValidLastName() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidLastName("Agarwal");
        assertEquals(true, result);
    }

    @Test
    void isValidEmail() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidEmail("abc.xyz@gmail.com");
        assertEquals(true, result);
    }

    @Test
    void isValidPhoneNumber() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidPhoneNumber("91 9876543210");
        assertEquals(true, result);
    }

    @Test
    void hasMinimumEightCharacters() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.hasMinimumEightCharacters("password");
        assertEquals(true, result);
    }

    @Test
    void hasMinimumEightCharactersAndOneUpperCase() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.hasMinimumEightCharactersAndOneUpperCase("Password");
        assertEquals(true, result);
    }

    @Test
    void hasMinimumEightCharactersAndOneDigit() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.hasMinimumEightCharactersAndOneDigit("Password1");
        assertEquals(true, result);
    }

    @Test
    void hasMinimumEightCharactersAndOneSpecialCharacter() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.hasMinimumEightCharactersAndOneSpecialCharacter("Password@");
        assertEquals(true, result);
    }

    @Test
    void isStrongPassword() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isStrongPassword("Password1@");
        assertEquals(true, result);
    }

    @ParameterizedTest
    @CsvSource({
        "abc@yahoo.com,true",
        "abc.100@yahoo.com,true",
        "abc-100@yahoo.com,true",
        ".abc@xyz.com,false"
    })
    void isSampleEmailValid(String email, boolean expected) {
        UserRegistration userRegistration = new UserRegistration();
        boolean actual;

        try {
            actual = userRegistration.isSampleEmailValid(email);
        } catch (UserRegistrationException e) {
            actual = false;
        }

        assertEquals(expected, actual);
    }
}