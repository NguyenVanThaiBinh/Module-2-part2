package com.BinhHu;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) throws IOException {
        File myObj = new File("Hello.txt");
        if(myObj.delete()){
            System.out.println("Deleted the file: "+myObj.getName());
            System.err.println("Everything is OK!");
        }
        else{
            System.out.println("Failed to delete the file.");
            System.err.println("Everything is OK!");
            int i=System.in.read();//returns ASCII code of 1st character
            System.out.println((char)i);//will print the character
        }
    }
}
