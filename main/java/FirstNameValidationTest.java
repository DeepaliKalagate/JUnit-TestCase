package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNameValidationTest
{
    private static Pattern firstNamePattern;

    public boolean validatingFirstName(String firstName)
    {
        firstNamePattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher=firstNamePattern.matcher(firstName);
        if (matcher.matches())
            return true;
        else
            return false;
    }
}
