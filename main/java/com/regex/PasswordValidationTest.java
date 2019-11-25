package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidationTest
{
    private static Pattern passwordValidation;
    public Boolean validateUserPassword(String argument)
    {
        passwordValidation=Pattern.compile("((?=.*[0-9])(?=.*[a-z]?)(?=.*[A-Z])(?=.*[@#*$%]).{8,})");
        Matcher matcher=passwordValidation.matcher(argument);
        if (matcher.matches())
            return true;
        else
            return false;
    }
}
