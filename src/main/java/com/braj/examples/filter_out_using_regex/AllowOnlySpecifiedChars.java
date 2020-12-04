package com.braj.examples.filter_out_using_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllowOnlySpecifiedChars {

    public static void main(String[] args) {

        AllowOnlySpecifiedChars allowOnlySpecifiedChars = new AllowOnlySpecifiedChars();

        String input =  "~~!TypeScript is an open-source language which builds on JavaScript, one of the world’s most used tools, by adding static type definitions.\n" +
                        "Types provide a way to describe the shape of an object, providing better documentation, and allowing TypeScript to validate that your code is working correctly.\n" +
                        "Writing types can be optional in ~TypeScript, because type inference allows you to get !!a lot of power without writing additional code."+
                        "TypeScript is an open-source language which builds on JavaScript, one of the world’s most used tools, by adding static type definitions.\n" +
                        "Types provide a way to describe the shape of an object, providing better documentation, and allowing TypeScript to validate that your code is working correctly.\n" +
                        "Writing types can be optional in TypeScript, because type inference allows you to get a lot of power without writing additional code#.";

        for (int i = 0; i <100 ; i++) {
            allowOnlySpecifiedChars.filterOutUsingEachCharCheck(input);
            allowOnlySpecifiedChars.filterOutUsingEntireString(input);
            System.out.println("\n");
        }
    }


    // Less efficient, more control
    public String filterOutUsingEachCharCheck(String inputStringWithSpecialChars){
        Pattern pattern = Pattern.compile("[A-Za-z0-9#&:;.,/]");
        long startTime = System.nanoTime();
        StringBuffer output = new StringBuffer();
        char[] inputCharArray = inputStringWithSpecialChars.toCharArray();

        for(char eachChar: inputCharArray){
            String eachCharAsString = Character.toString(eachChar);
            Matcher matcher = pattern.matcher(eachCharAsString);
            if(matcher.matches())
                output.append(eachCharAsString);
            else
                output.append(" ");
        }
        long endTime = System.nanoTime();
        System.out.println(output.toString());
        System.out.println("Time Taken [by Each Char] : "+  (endTime-startTime));
        return output.toString();
    }


    //More Efficient, less time taking
    public String filterOutUsingEntireString(String inputStringWithSpecialChars){
        long startTime = System.nanoTime();
        inputStringWithSpecialChars = inputStringWithSpecialChars.replaceAll("[^A-Za-z0-9#&:;.,/]"," ");
        long endTime = System.nanoTime();
        //System.out.println(inputStringWithSpecialChars);
        System.out.println("Time Taken [Entire String] : "+  (endTime-startTime));
        return inputStringWithSpecialChars;
    }

}
