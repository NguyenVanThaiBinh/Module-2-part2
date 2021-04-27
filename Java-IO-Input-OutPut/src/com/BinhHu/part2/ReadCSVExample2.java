package com.BinhHu.part2;

import java.io.*;

public class ReadCSVExample2 {
    public static void main(String[] args) {
        String path = "C:\\Users\\USER\\Desktop\\CSVDemo.csv";
        String line = "";
        try {
            Writer out;
            BufferedWriter bwrite = new BufferedWriter(new FileWriter("AA.txt"));
            bwrite.write("BBBBBBBBBBBBBBBBBB");
            bwrite.close();
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
