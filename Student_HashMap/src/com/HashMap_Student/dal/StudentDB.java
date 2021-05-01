package com.HashMap_Student.dal;

import java.io.*;
import java.util.Map;

import static com.HashMap_Student.service.StudentService.hashMap;

public class StudentDB {
    public static void saveToCSV() throws IOException {
        System.out.println("Start to save...");
        System.out.println("----------");

        String header = "ID, Name, Adress, Age, GPA \n";


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("studentList.csv"));
        bufferedWriter.write(header);
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            String line = entry.getKey() + ", " + entry.getValue();
            bufferedWriter.write(line);
        }

        bufferedWriter.close();
    }
    public static void readFromTXT() throws Exception{

        try {
            BufferedReader bufferedReader = new BufferedReader
                    (new FileReader("studentList.csv"));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("---------------");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
