package com.BinhHu.Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        String text1 = "Hello java regex 2-12-2018, " +
                "hello world 12/12/2018";
        Pattern pattern = Pattern.compile("\\d{1,2}" +
                "[-|/]"+"\\d{1,2}"+"[-|/]"+"\\d{4}");

        Matcher matcher = pattern.matcher(text1);
        System.out.println("Day Month in text1:"+text1);
        while(matcher.find()){
            System.out.println(text1.substring(matcher.start(),
                    matcher.end()));

        }
        String text2 = "2/12/2018";
        String text3 = "2/12/2a1a";

        pattern = Pattern.compile("^\\d{1,2}[-|/]\\d{1,2}" +
                "[-|/]\\d{4}$");
        System.out.println("\nChuoi "+text2+" in day month fomat -> "
        +pattern.matcher(text2).matches());
        System.out.println("Chuoi "+text3+"in day month fomat   -> "
        +pattern.matcher(text3).matches());
    }
}
