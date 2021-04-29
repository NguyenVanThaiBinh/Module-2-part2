package com.HashMap_Student.service;

import com.HashMap_Student.model.Student;

import java.io.*;
import java.util.*;

public class StudentService {

    public static HashMap<Integer, String> hashMap = new HashMap<>();


    static Scanner sc = new Scanner(System.in);
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


    public static void deleteStudent() {
        System.out.println("Input ID of student to delete:");
        int id = sc.nextInt();
        boolean check = true;
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {

            if (id == entry.getKey()) {
                hashMap.remove(id);
                System.out.println("Delete Complete!");
                System.out.println("---------------");
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Can't not delete!");
            System.out.println("---------------");
        }


//        for (Student student : studentList) {
//            if (student.getId() == id) {
//                studentList.remove(student);
//                System.out.println("Delete Complete!");
//                break;
//            }
//        }

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

    public static void inputStudent() {
//        int n;
//        do {
//            System.out.println("Input the number of student: ");
//            while (!sc1.hasNextInt()) {
//                System.out.println("Please Input True:");
//                sc1.next();
//            }
//            n = sc1.nextInt();
//        } while (n < 0);


//        for (int i = 0; i < n; i++) {
        Student student = new Student();
        student.input();
        String line = student.getFileLine();
        hashMap.put(student.getId(), line);
    }




    public static void editStudent() {
        System.out.println("Input ID of student to edit:");
        int id = sc.nextInt();
        boolean check = true;
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            if(id == entry.getKey()){
                hashMap.remove(id);

                Student student = new Student();
                student.input();
                String line = student.getFileLine();
                hashMap.put(id, line);

                check = false;
                break;
            }

        }
        if(check){
            System.out.println("Can't find ID!!!");
        }

//        for (Student student : studentList) {
//            if (student.getId() == id) {
//                student.input();
//                break;
//            }
//        }

    }

    public static void showMenu() {
        System.out.println("1.Add student.");
        System.out.println("2.Edit student.");
        System.out.println("3.Delete student.");
        System.out.println("4.Save to student.csv");
        System.out.println("5.Read from student.csv");
        System.out.println("6.Exit.");
        System.out.println(" Your choose:");
    }
}

