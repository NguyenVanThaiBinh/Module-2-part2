package com.BinhHu.part2;

import java.io.*;

public class BufferedOutputStreamExample {
    public static void main(String[] args) throws IOException {
        File file;
        FileOutputStream fout = new FileOutputStream("file.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s= "Welcome to java of BinhHu";
        byte b[] = s.getBytes();
        bout.write(b);

        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Success!");
    }
}
