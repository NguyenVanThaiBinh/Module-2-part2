package com.BinhHu.Exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteObject {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Binh Hu", "New York"));
        studentList.add(new Student("Binh Hu 1", "New York 1"));
        studentList.add(new Student("Binh Hu 2", "New York 2"));
        studentList.add(new Student("Binh Hu 3", "New York 3"));
        BufferedWriter buffW = null;
        try {
            buffW = new BufferedWriter(new FileWriter("StudentList.txt"));
            for (Student student : studentList) {
                String line = student.getLineFileFormat() + "\n";
                buffW.write(line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

            if (buffW != null) {
                try {
                    buffW.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }

    public static class Student {
        String Name;

        public String getLineFileFormat() {
            return Name + ",  " + Address;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public Student(String name, String address) {
            Name = name;
            Address = address;
        }

        String Address;
    }
}
