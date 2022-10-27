package thuc_hanh_binary_serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"a","HN"));
        students.add(new Student(2,"b","HN"));
        students.add(new Student(3,"c","HN"));
        students.add(new Student(4,"d","HN"));
        writeToFile("student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("student.txt");
        for (Student student: studentDataFromFile){
            System.out.println(student);
        }
    }

    public static void writeToFile(String path, List<Student> students){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos=  new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);

            students =(List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return students;
    }

}
