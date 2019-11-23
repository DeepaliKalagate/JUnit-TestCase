package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationTest
{
    private static Pattern emailValidation;
    public Boolean checkEmail(String email)
    {
        emailValidation=Pattern.compile("^([a-zA-Z0-9]+)([.-_+][a-zA-Z0-9]+)?+[@][a-zA-Z0-9]+[.][a-z]{2,3}*([.]?[a-z]{2,3})?$");
        Matcher matcher=emailValidation.matcher(email);
        if (matcher.matches())
            return true;
        else
            return false;
    }
}
