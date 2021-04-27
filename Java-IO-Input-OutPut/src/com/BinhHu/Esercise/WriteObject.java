package com.BinhHu.Esercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteObject {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Binh Hu", "New York"));
        studentList.add(new Student("Binh Hu 1", "New York 1"));
        studentList.add(new Student("Binh Hu 2", "New York 2"));
        FileOutputStream fos = null;
        BufferedWriter buffW = null;
        ObjectOutputStream oos = null;
        try {
            Writer out;
            buffW = new BufferedWriter(new FileWriter("StudentList.txt"));
            File file;
            fos = new FileOutputStream("StudentList1.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);


            
//            for (Student student : studentList) {
//                String line = student.getLineFileFormat() + "\n";
//                buffW.write(line);
//            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                buffW.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public static class Student implements Serializable {
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
