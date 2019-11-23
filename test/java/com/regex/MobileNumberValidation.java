package com.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MobileNumberValidation
{
    private com.regex.MobileNumberValidationTest mobileNumberValidationTest;
    @Test
    public void CheckMobileNumber_ifValid_ShouldReturnTrue()
    {
        System.out.println("Validating Mobile Number");
        Assert.assertTrue(mobileNumberValidationTest.validatingMobileNumber("91 8412989861"));
    }

    @Before
    public void initializing()
    {
        mobileNumberValidationTest=new com.regex.MobileNumberValidationTest();
    }
}
