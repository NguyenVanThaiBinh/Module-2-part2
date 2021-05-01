package com.HashMap_Student.presentation;



import java.io.*;
import java.util.*;

import static com.HashMap_Student.dal.StudentDB.readFromTXT;
import static com.HashMap_Student.dal.StudentDB.saveToCSV;
import static com.HashMap_Student.service.StudentService.*;

public class MainStudent {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)  {
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
                    try {
                        saveToCSV();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        readFromTXT();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 8:
                    System.out.println("Exit.");
                    break;
                case 7:
                    sortByName();
                    break;
                case 6:
                    sortByGPA();
                    break;
                default:
                    System.out.println("Wrong Input!");
                    break;
            }

        } while (choose != 8);
    }
}

