package com.BinhHu.Exercise;

import java.io.*;
import java.util.ArrayList;

public class SaveObject {
    public static void main(String[] args) {
        try{
            final String path = "student.dat";
            ArrayList<Student> students = readAllObject(path);
            final String csvPath = "student.csv";
            creatFile(csvPath);
            System.out.println(readCSV(csvPath));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }



    public static void creatFile(String path) throws IOException {

        File file = new File(path);
        if (file.exists()) {
            System.out.println("file is exists");
        } else {
            file.createNewFile();
        }
    }
    public static ArrayList<Student> readAllObject(String path) throws IOException, ClassNotFoundException {

        ArrayList<Student> studentList = new ArrayList<>();
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);


        if (fis.available() > 0) {
           studentList = (ArrayList)ois.readObject();
        }
        ois.close();
        return  studentList;

    }
    public static void appendArray(ArrayList students,String path) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(students);
        oos.flush();

        oos.close();
        fos.close();
    }

    public static Student readFile(String path) throws Exception {

        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student = null;
        if (fis.available() > 0) {
            student = (Student) ois.readObject();
        }
        return student;
    }

    public static void writeFile(Student student, String path,boolean append) throws Exception {

        FileOutputStream fos = new FileOutputStream(path,append);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        oos.flush();

        oos.close();
        fos.close();
    }

    public static class Student implements Serializable {
        public Student(String name, String age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return name+", "+ age+"\n";
        }

        String name, age;
    }
    public static void writeCSV(String path,ArrayList<Student>students ) throws IOException {
        FileOutputStream writer = new FileOutputStream(path);
        for(int i=0;i<students.size();i++){
            byte[] b = students.get(i).toString().getBytes();
            writer.write(b);
        }
    }
    public static ArrayList<Student> readCSV(String path){
        FileReader read = null;
        BufferedReader bufferedReader = null;
        ArrayList<Student> arrayList = new ArrayList<>();
        try {
            read = new FileReader(path);
            bufferedReader = new BufferedReader(read);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                String[] str =  line.split(",");
                Student st = new Student(str[0],str[1]);
                arrayList.add(st);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(read!=null){
                try {
                    read.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return arrayList;
        }
    }
}
