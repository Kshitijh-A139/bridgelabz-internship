package com.bridgelabz.uservalidation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UserValidationTest {

    UserValidation validator = new UserValidation();

    @Test
    void givenValidFirstName_ShouldReturnTrue() {
        assertEquals(true,
                validator.isValidFirstName("Kshitijh"));
    }

    @Test
    void givenValidLastName_ShouldReturnTrue() {
        assertEquals(true,
                validator.isValidLastName("Agarwal"));
    }

    @Test
    void givenValidEmail_ShouldReturnTrue() {
        assertEquals(true,
                validator.isValidEmail("abc.xyz@gmail.com"));
    }

    @Test
    void givenValidPhoneNumber_ShouldReturnTrue() {
        assertEquals(true,
                validator.isValidPhoneNumber("91 9876543210"));
    }

    @Test
    void givenValidPasswordRule1_ShouldReturnTrue() {
        assertEquals(true,
                validator.isValidPasswordRule1("password"));
    }

    @Test
    void givenValidPasswordRule2_ShouldReturnTrue() {
        assertEquals(true,
                validator.isValidPasswordRule2("Password"));
    }

    @Test
    void givenValidPasswordRule3_ShouldReturnTrue() {
        assertEquals(true,
                validator.isValidPasswordRule3("Password1"));
    }

    @Test
    void givenValidPasswordRule4_ShouldReturnTrue() {
        assertEquals(true,
                validator.isValidPasswordRule4("Password1@"));
    }

    @ParameterizedTest
    @CsvSource({
            "abc@yahoo.com,true",
            "abc.100@yahoo.com,true",
            "abc-100@yahoo.com,true",
            ".abc@xyz.com,false"
    })
    void givenEmailSamples_ShouldReturnExpectedResult(
            String email, boolean expected) {

        assertEquals(expected,
                validator.isSampleEmailValid(email));
    }
}