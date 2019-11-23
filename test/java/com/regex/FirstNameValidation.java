package com.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FirstNameValidation
{
    private FirstNameValidationTest firstNameValidationTest;

    @Test
    public void checkFirstName_ifValid_ShouldReturnTrue()
    {
        System.out.println("Validating First Name of User");
        Assert.assertTrue(firstNameValidationTest.validatingFirstName("Deepali"));
    }

    @Before
    public void initializing()
    {
        firstNameValidationTest = new FirstNameValidationTest();
    }
}
