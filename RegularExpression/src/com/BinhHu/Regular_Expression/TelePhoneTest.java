package com.BinhHu.Regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelePhoneTest {
    public static void main(String[] args) {
        //simple
       String regex = "^0+[1-9]\\d{8}$";
       //different
//        String regex1 = "^\\(\\d{3}\\)d{4}.\\d{4}$";
//        // mean 1 character '('

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while(!matcher.find()){

            System.out.println("Please input right format for telephone!");
            input= sc.nextLine();
            matcher = pattern.matcher(input);
        }
        System.out.println("OK!");


    }
}
