package com.epam.larionov.service.impl;

import com.epam.larionov.service.ProcessRegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProcessRegExpImpl implements ProcessRegExp {

    @Override
    public String processString(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        Pattern pattern = Pattern.compile("\\+\\d\\s\\(\\d{3}\\)\\s\\d{3}\\s\\d{2}\\s\\d{2}");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            stringBuilder.append(string, start, end);

        }
        return String.valueOf(stringBuilder);
    }
}
