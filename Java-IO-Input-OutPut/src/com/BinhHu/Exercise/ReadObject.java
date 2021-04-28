package com.BinhHu.Exercise;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        Reader in;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Demo.csv"));
            String line;
            while((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
