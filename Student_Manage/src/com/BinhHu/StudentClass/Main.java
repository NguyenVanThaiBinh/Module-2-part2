package com.BinhHu.StudentClass;

import java.io.*;
import java.util.*;

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
                    sortByGPA();
                    break;
                case 7:
                    sortByName();
                    break;
                case 8:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Wrong Input!");
                    break;
            }

        } while (choose != 8);
    }

    private static void sortByGPA() {

        Collections.sort(studentList, (o1, o2) -> {
            if (o1.getGpa() < o2.getGpa()) {
                return -1; //doi cho~
            }
            return 1;
        });
        System.out.println("Is Sorted!");
        System.out.println("------------");
    }

    private static void sortByName() {
        Collections.sort(studentList, (o1, o2) -> {
            // co dau '-' la A-> Z
            return o1.getName().compareToIgnoreCase(o2.getName());
        });
        System.out.println("Is Sorted!");
        System.out.println("------------");
    }


    private static void saveToTXT() throws IOException {
        System.out.println("Start to save...");
        System.out.println("----------");

        String header = "ID, Age, Name, Adress, GPA \n";


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("studentList.csv"));
        bufferedWriter.write(header);
        for (Student sStudent : studentList) {
            String line = sStudent.getFileLine();
            bufferedWriter.write(line);
        }

        bufferedWriter.close();


    }

    private static void deleteStudent() throws IOException {
        System.out.println("Input ID of student to delete:");
        int id = sc.nextInt();
        boolean check = true;
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                System.out.println("Is't deleted!");
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("Can't not delete!");
        }
        saveToTXT();

    }

    private static void readFromTXT() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("studentList.csv"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        System.out.println("-------------");
        bufferedReader.close();
    }

    private static void inputStudent() throws IOException {

        Student student = new Student(23, "binh", "hue", 4);
        Student student1 = new Student(24, "hoa", "da nang", 9);
        Student student2 = new Student(25, "dao", "quang ngai", 7);
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        System.out.println("Auto added!");
        System.out.println("--------------");
//        int n;
//        do {
//            System.out.println("Input the number of student: ");
//            while (!sc.hasNextInt()) {
//                System.out.println("Please Input True:");
//                sc.next();
//            }
//            n = sc.nextInt();
//        } while (n < 0);
//
//
//        for (int i = 0; i < n; i++) {
//            Student student = new Student();
//            student.input();
//            studentList.add(student);
//        }
    saveToTXT();
    }

    private static void editStudent() throws IOException {
        System.out.println("Input ID of student to edit:");
        int id = sc.nextInt();
        for (Student student : studentList) {
            if (student.getId() == id) {
                student.input();
                break;
            }
        }
        saveToTXT();

    }

    static void showMenu() {
        System.out.println("1.Add student.");
        System.out.println("2.Edit student.");
        System.out.println("3.Delete student.");
//        System.out.println("4.Save to student.txt");
        System.out.println("5.Read from student.txt");
        System.out.println("6.Sort by GPA");
        System.out.println("7.Sort by Name");
        System.out.println("8.Exit.");
        System.out.println(" Your choose:");
    }
}
