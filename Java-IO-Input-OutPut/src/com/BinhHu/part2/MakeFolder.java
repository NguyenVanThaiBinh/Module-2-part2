package com.BinhHu.part2;

import java.io.File;

public class MakeFolder {
    public static void main(String[] args) {
        File file = new File("D:\\Directory2" +
                "");
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("Directory is created!");
            }
        }
        else {
            System.out.println("Failed to create directory!");
        }

    }
}
