package com.BinhHu.StudentClass;

import java.util.Scanner;

public class Student {
    int id, age;
    String name, address;
    static int count; // vung du lieu dung` chung


    public Student() {
        id = ++count;
    }

    public void display() {
        System.out.println(this);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);


        System.out.println("Input name: ");
        name = sc.nextLine();
        System.out.println("Input Address: ");
        address = sc.nextLine();
        //check Age pro
        do {
            System.out.println("Input Age: ");
            while (!sc.hasNextInt()) {
                System.out.println("Please input Age again: ");
                sc.next();
            }
            age = sc.nextInt();
        } while (age <= 0 || age >= 130);

        do {
            System.out.println("Input GPA: ");
            while (!sc1.hasNextInt()) {
                System.out.println("Please input GPA again: ");
                sc1.next();
            }
            gpa = sc1.nextInt();
        } while (gpa <= 0 && age >= 10);



    }
    public String getHeaderFile(){
        return "ID, Age, Name, Adress, GPA \n";
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gpa=" + gpa +
                '}';
    }
    public String getFileLine(){
        return id+", "+name+", "+age+", "+address+", "+gpa+"\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public Student(int age, String name, String address, int gpa) {
        id = ++count;
        this.age = age;
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    int gpa;
}
