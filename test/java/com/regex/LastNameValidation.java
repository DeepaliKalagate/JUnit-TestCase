package com.regex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LastNameValidation
{
        private LastNameValidationTest lastNameValidationTest;

        @Test
        public void checkLastName_ifValid_ShouldReturnTrue()
        {
            System.out.println("Validating Last name of User");
            Assert.assertTrue(lastNameValidationTest.validatingLastName("Patil"));
        }

        @Before
        public void initialize()
        {
            lastNameValidationTest=new LastNameValidationTest();
        }
    }

