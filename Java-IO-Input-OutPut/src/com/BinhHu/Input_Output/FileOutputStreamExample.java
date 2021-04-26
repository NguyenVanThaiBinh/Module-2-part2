package com.BinhHu;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try{
            File file;
            FileOutputStream fout = new FileOutputStream("BinhHu.txt");
            File infoFile = new File("BinhHu.txt");

            fout.write(66);
            fout.flush();
            fout.write(68);
            System.out.println(infoFile.getAbsolutePath());
            System.out.println("-----------");
            System.out.println("Input String by byte");
            String s = "Binh Hu Mam Nem";
            byte b[] = s.getBytes();
            fout.write(b);

            fout.close();
            System.out.println("Success...");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
