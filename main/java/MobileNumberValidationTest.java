package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidationTest
{
    private static Pattern mobileNumber;
    public boolean validatingMobileNumber(String s)
    {
        mobileNumber=Pattern.compile("^[0-9]{2}[: :][0-9]{10}$");
        Matcher matcher=mobileNumber.matcher(s);
        if (matcher.matches())
            return true;
        else
            return false;
    }
}
