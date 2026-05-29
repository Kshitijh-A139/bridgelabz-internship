package com.bridgelabz.uservalidation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UserValidationTest {


    UserValidation userValidation = new UserValidation();

    @Test
    void givenFirstName_WhenValid_ShouldReturnTrue() throws UserValidationException {
        boolean result = userValidation.isValidFirstName("Kshitijh");
        assertEquals(true, result);
    }

    @Test
    void givenLastName_WhenValid_ShouldReturnTrue() throws UserValidationException {
        boolean result = userValidation.isValidLastName("Agarwal");
        assertEquals(true, result);
    }

    @Test
    void givenEmail_WhenValid_ShouldReturnTrue() throws UserValidationException {
        boolean result = userValidation.isValidEmail("abc.xyz@gmail.com");
        assertEquals(true, result);
    }

    @Test
    void givenPhoneNumber_WhenValid_ShouldReturnTrue() throws UserValidationException {
        boolean result = userValidation.isValidPhoneNumber("91 9876543210");
        assertEquals(true, result);
    }

    @Test
    void givenPasswordRule1_WhenValid_ShouldReturnTrue() throws UserValidationException {
        boolean result = userValidation.isValidPasswordRule1("password");
        assertEquals(true, result);
    }

    @Test
    void givenPasswordRule2_WhenValid_ShouldReturnTrue() throws UserValidationException {
        boolean result = userValidation.isValidPasswordRule2("Password");
        assertEquals(true, result);
    }

    @Test
    void givenPasswordRule3_WhenValid_ShouldReturnTrue() throws UserValidationException {
        boolean result = userValidation.isValidPasswordRule3("Password1");
        assertEquals(true, result);
    }

    @Test
    void givenPasswordRule4_WhenValid_ShouldReturnTrue() throws UserValidationException {
        boolean result = userValidation.isValidPasswordRule4("Password@1");
        assertEquals(true, result);
    }

    @ParameterizedTest
    @CsvSource({
            "abc@yahoo.com,true",
            "abc-100@yahoo.com,true",
            "abc.100@yahoo.com,true",
            "abc111@abc.com,true",
            "abc-100@abc.net,true",
            "abc.100@abc.com.au,true",
            "abc@1.com,true",
            "abc@gmail.com.com,true",
            "abc+100@gmail.com,true",
            ".abc@abc.com,false",
            "abc@.com,false",
            "abc123@gmail.a,false",
            "abc123@.com,false",
            "abc123@.com.com,false",
            "abc()*@gmail.com,false",
            "abc@%*.com,false",
            "abc..2002@gmail.com,false",
            "abc.@gmail.com,false",
            "abc@abc@gmail.com,false",
            "abc@gmail.com.1a,false"
    })

    void givenEmails_WhenValidated_ShouldReturnExpectedResult(String email, boolean expected) {

        boolean actual;

        try {
            actual = userValidation.validateSampleEmails(email);
        } catch (UserValidationException e) {
            actual = false;
        }

        assertEquals(expected, actual);
    }
}