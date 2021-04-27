package com.BinhHu.part2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        try{
            File file;
            FileInputStream fin = new FileInputStream("file.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;



            while((i = bin.read()) != -1){
                System.out.print((char) i);
            }
            bin.close();
            fin.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
