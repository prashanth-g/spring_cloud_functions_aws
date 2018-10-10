package com.prashanth.spring.cloud.functions.aws;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class UpperCaseStringHandler implements Function<String, String> {

    @Override
    public String apply(String s) {
        return s.toUpperCase();
    }
}
