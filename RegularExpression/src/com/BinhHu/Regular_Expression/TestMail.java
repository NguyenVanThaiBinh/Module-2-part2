package com.BinhHu.Regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMail {
    public static void main(String[] args) {
        String regex ="^\\w[a-z0-9]*@[a-z0-9]*.[a-z0-9]*$";
//        ^\w+ start by  one character
//        [a-z0-9]*  number or character, free length
//        \w     sum with character
//        mail.com$  the last must be 'mail.com$'
         Scanner sc = new Scanner(System.in);
         String input = sc.nextLine();
         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(input);
//         if(matcher.find()){
//             System.out.println("OK");
//         }else{
//             System.out.println("Please check again!");
//         }
         while(!matcher.find()){

             System.out.println("Please input right format for email!");
             input= sc.nextLine();
             matcher = pattern.matcher(input);
         }
        System.out.println("OK!");


    }
}
