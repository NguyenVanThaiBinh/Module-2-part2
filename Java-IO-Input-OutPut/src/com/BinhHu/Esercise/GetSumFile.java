package com.BinhHu.Esercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class GetSumFile {
    //             C:\\Users\\USER\\Desktop\\numberSum.txt
    public static void main(String[] args) {
        System.out.println("Input the path: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        int sum = getSumOfFile(path);
        System.out.println("Sum of file is: "+sum);
    }
    public  static int getSumOfFile(String path) {
        int sum = 0;
        try {
            File file;
            FileReader reader = new FileReader(path);
            Scanner scanner1 = new Scanner(reader);
            while(scanner1.hasNextLine()){
                sum += Integer.parseInt(scanner1.nextLine()) ;
            }


            //C2
//            BufferedReader buff = new BufferedReader(reader);
//            String line = "";
//            while ((line = buff.readLine())!=null){
//                sum += Integer.parseInt(line);
//            }
//            buff.close();
//            reader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return sum;


    }
}
