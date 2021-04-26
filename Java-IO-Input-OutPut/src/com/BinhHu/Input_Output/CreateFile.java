package com.BinhHu.Input_Output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try{
            File myObj = new File("filename.txt");
            if(myObj.createNewFile()){
                System.out.println("File created:"+myObj.getName());
            }
            else{
                System.out.println("File already exists.");
            }
            System.out.println("-------------");
            FileWriter myWriter = new FileWriter(myObj);
            myWriter.write("Files in Java might be tricky," +
                    "but it is fun!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch(IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
