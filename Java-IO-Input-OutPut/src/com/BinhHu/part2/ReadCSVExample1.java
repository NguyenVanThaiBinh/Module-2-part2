package com.BinhHu.part2;

import java.io.*;
import java.util.Scanner;

public class ReadCSVExample1 {
    public static void main(String[] args) throws IOException {
        File a = new File("C:\\Users\\USER\\Desktop\\CSVDemo.csv");
        FileInputStream fin = new FileInputStream(a);
        int line;
        while ((line = fin.read()) != -1) {

            char i = (char) line;

            System.out.print(i);
        }
//        BufferedReader buffer = new BufferedReader(new FileReader(a));
//        String line;
//
//        while ((line= buffer.readLine()) != null){
//          //  char c = (char) line;
//            System.out.println(line);
//        }

//
//        Scanner scanner = new Scanner(a);
//
//        while(scanner.hasNext()){
//            System.out.println(scanner.nextLine());
//        }
//        scanner.close();
    }
}
