package com.BinhHu.StudentClass;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Student> studentList = new ArrayList();
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        int choose;
        do {
            showMenu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    inputStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    saveToTXT();
                    break;
                case 5:
                    readFromTXT();
                    break;
                case 6:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Wrong Input!");
                    break;
            }

        } while (choose != 6);
    }

    private static void saveToTXT() throws IOException {
        System.out.println("Start to save...");
        System.out.println("----------");
        Student student = new Student();
         String header =student.getHeaderFile();


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("studentList.txt"));
        bufferedWriter.write(header);
        for (Student sStudent : studentList) {
            String line = sStudent.getFileLine();
            bufferedWriter.write(line);
        }

        bufferedWriter.close();


    }

    private static void deleteStudent() {
        System.out.println("Input ID of student to delete:");
        int id = sc.nextInt();
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                break;
            }
        }

    }

    private static void readFromTXT() {
    }

    private static void inputStudent() {
        int n;
        do {
            System.out.println("Input the number of student: ");
            while (!sc.hasNextInt()) {
                System.out.println("Please Input True:");
                sc.next();
            }
            n = sc.nextInt();
        } while (n < 0);


        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.input();
            studentList.add(student);
        }

    }

    private static void editStudent() {
        System.out.println("Input ID of student to edit:");
        int id = sc.nextInt();
        for (Student student : studentList) {
            if (student.getId() == id) {
                student.input();
                break;
            }
        }

    }

    static void showMenu() {
        System.out.println("1.Add student.");
        System.out.println("2.Edit student.");
        System.out.println("3.Delete student.");
        System.out.println("4.Save to student.txt");
        System.out.println("5.Read from student.txt");
        System.out.println("6.Exit.");
        System.out.println(" Your choose:");
    }
}
