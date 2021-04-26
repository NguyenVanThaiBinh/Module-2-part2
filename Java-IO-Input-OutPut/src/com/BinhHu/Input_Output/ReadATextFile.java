package com.BinhHu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadATextFile {
    public static void main(String[] args) {
        try {
            File inFile = new File("Hello.txt");

            FileReader fileReader = new FileReader(inFile);

            BufferedReader reader = new BufferedReader(fileReader);
        String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
