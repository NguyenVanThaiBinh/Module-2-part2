package com.BinhHu.Exercise;

import java.io.*;
import java.util.ArrayList;

public class SaveObject_InClass {
    public static void main(String[] args) {
        try{
            final String path = "student.dat";
            ArrayList<StudentInClass> studentInClasses = readAllObject(path);
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
    public static ArrayList<StudentInClass> readAllObject(String path) throws IOException, ClassNotFoundException {

        ArrayList<StudentInClass> studentInClassList = new ArrayList<>();
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);


        if (fis.available() > 0) {
           studentInClassList = (ArrayList)ois.readObject();
        }
        ois.close();
        return studentInClassList;

    }
    public static void appendArray(ArrayList students,String path) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(students);
        oos.flush();

        oos.close();
        fos.close();
    }

    public static StudentInClass readFile(String path) throws Exception {

        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        StudentInClass studentInClass = null;
        if (fis.available() > 0) {
            studentInClass = (StudentInClass) ois.readObject();
        }
        return studentInClass;
    }

    public static void writeFile(StudentInClass studentInClass, String path, boolean append) throws Exception {

        FileOutputStream fos = new FileOutputStream(path,append);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(studentInClass);
        oos.flush();

        oos.close();
        fos.close();
    }

    public static class StudentInClass implements Serializable {
        public StudentInClass(String name, String age) {
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
    public static void writeCSV(String path,ArrayList<StudentInClass> studentInClasses) throws IOException {
        FileOutputStream writer = new FileOutputStream(path);
        for(int i = 0; i< studentInClasses.size(); i++){
            byte[] b = studentInClasses.get(i).toString().getBytes();
            writer.write(b);
        }
    }
    public static ArrayList<StudentInClass> readCSV(String path){
        FileReader read = null;
        BufferedReader bufferedReader = null;
        ArrayList<StudentInClass> arrayList = new ArrayList<>();
        try {
            read = new FileReader(path);
            bufferedReader = new BufferedReader(read);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                String[] str =  line.split(",");
                StudentInClass st = new StudentInClass(str[0],str[1]);
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
