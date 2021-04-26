package com.BinhHu;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStramExample {
    public static void main(String[] args) {
        try{
            File file;
            FileInputStream fin = new FileInputStream("BinhHu.txt");
           File myObj = new File("BinhHu.txt");
            System.out.println(myObj.getAbsolutePath());
            int i = 0;
           while((i = fin.read())!= -1){
               System.out.print((char) i);
           }


        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
