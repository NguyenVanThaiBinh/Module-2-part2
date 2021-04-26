package com.BinhHu.Input_Output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try{
            File file;
            FileWriter writer = new FileWriter("Hello.txt");
            writer.write("Hello!");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}