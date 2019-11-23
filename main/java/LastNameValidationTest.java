package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNameValidationTest
{

    private static Pattern lastNameValidation;
    public boolean validatingLastName(String lastName)
    {
        lastNameValidation=Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher=lastNameValidation.matcher(lastName);
        if (matcher.matches())
            return true;
        else
            return false;
    }
}
