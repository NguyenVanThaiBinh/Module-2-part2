package com.HashMap_Student.service;

import com.HashMap_Student.model.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.Map.Entry;

public class StudentService {

    public static HashMap<Integer, String> hashMap = new HashMap<>();


    static Scanner sc = new Scanner(System.in);


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
    }


    public static void inputStudent() {
        Student student = new Student(23,"binh","hue",5);
        Student student1 = new Student(27,"chau","hue",3);
        Student student2 = new Student(20,"an","hue",8);

        //String line = student.getFileLine();
        hashMap.put(student.getId(), student.getFileLine());
        hashMap.put(student1.getId(), student1.getFileLine());
        hashMap.put(student2.getId(), student2.getFileLine());
    }
     public static void sortByName(){



         System.out.println("Is Sorted!");
         System.out.println("------------");
    }
     public static void  sortByGPA(){
         List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>((Collection<? extends Entry<String, Integer>>) hashMap.entrySet());
     }

    public static void editStudent() {
        System.out.println("Input ID of student to edit:");
        int id = sc.nextInt();
        boolean check = true;
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            if (id == entry.getKey()) {
                hashMap.remove(id);

                Student student = new Student();
                student.input();
                String line = student.getFileLine();
                hashMap.put(id, line);

                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Can't find ID!!!");
        }
    }

    public static void showMenu() {
        System.out.println("1.Add student.");
        System.out.println("2.Edit student.");
        System.out.println("3.Delete student.");
        System.out.println("4.Save to student.csv");
        System.out.println("5.Read from student.csv");
        System.out.println("6.Sort by GPA");
        System.out.println("7.Sort by Name");
        System.out.println("8.Exit.");
        System.out.println(" Your choose:");
    }
}

