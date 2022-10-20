package Map;

import java.util.*;

public class StudentManager {
    public static void main(String[] args) {
        Student student = new Student("a",23,"HN") ;
        Student student1 = new Student("b",24,"HN") ;
        Student student2 = new Student("c",25,"HN") ;

        Map<Integer,Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student);
        studentMap.put(2,student2);
        studentMap.put(3,student1);

        for (Map.Entry<Integer,Student> x: studentMap.entrySet() ) {
            System.out.println(x.toString());
        }

        System.out.println("\n-------------------------\n");

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student);

        for (Student x: students){
            System.out.println(x.toString());
        }

        System.out.println("\n-------------------------\n");

        Student1 student11 = new Student1("d",12,"HN");
        Student1 student12 = new Student1("e",10,"HN");
        Student1 student13 = new Student1("f",11,"HN");

        List<Student1> lists = new ArrayList<>();
        lists.add(student11);
        lists.add(student12);
        lists.add(student13);

        Collections.sort(lists);
        for (Student1 x: lists) {
            System.out.println(x.toString());
        }
        System.out.println("\n-------------------------\n");

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi");
        for (Student1 x: lists){
            System.out.println(x.toString());
        }




    }
}
