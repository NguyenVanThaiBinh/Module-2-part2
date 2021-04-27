package com.BinhHu.part2;

import java.io.*;

public class SequenceInputStream_Example {
    public static void main(String[] args) throws IOException {
        File a = new File("A1.txt");


        FileOutputStream fout = new FileOutputStream(a);
        String z = "Binh Hu la tui  ";
        byte b[] = z.getBytes();
        System.out.println(a.getAbsolutePath());
        fout.write(b);

        FileOutputStream fout1 = new FileOutputStream("A2.txt");
        String y = "Tui la Binh Hu";
        byte c[] = y.getBytes();
        fout1.write(c);

        FileInputStream input = new FileInputStream("A1.txt");
        FileInputStream input1 = new FileInputStream("A2.txt");
        SequenceInputStream inst = new SequenceInputStream(input, input1);
        int j;
        while ((j = inst.read()) != -1) {
            System.out.print((char) j);
        }
        inst.close();
        input1.close();
        input.close();


    }
}
