package com.StudentPoint.presentation;


import com.StudentPoint.service.StudentService;

import java.io.IOException;
import java.util.Scanner;

public class StudentPointMain  {
    public  static void main(String[] args) {
        StudentService studentService = new StudentService();
        try {
            studentService.loadFileStudent();
        } catch (IOException e) {
            System.err.println("Student Manager File is Empty!");
        }
        int choose;
        do {
            showMenu();
            choose = new Scanner(System.in).nextInt();
            switch (choose) {
                case 1:
                    try {
                        studentService.addStudent();
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        studentService.editStudent();
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        studentService.deleteStudent();
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        studentService.readFileStudent();
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        studentService.sortStudentByAvengerPoint();
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Wrong Input!");
                    System.out.println("------------");
                    break;
            }

        } while (choose != 6);
    }

    static void showMenu() {
        System.out.println("1.Add student.");
        System.out.println("2.Edit student.");
        System.out.println("3.Delete student.");
        System.out.println("4.Show student List.");
        System.out.println("5.Sort by Avenger Point.");
        System.out.println("6.Exit.");
        System.out.println(" Your choose:");
    }
}
