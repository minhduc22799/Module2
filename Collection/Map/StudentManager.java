package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentManager {
    public static void main(String[] args) {
        Student student = new Student("a",12,"Hanoi");
        Student student1 = new Student("b",13,"DaNang");
        Student student2 = new Student("c",14,"HoChiMinh");

        Map<Integer,Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student);
        studentMap.put(2,student2);
        studentMap.put(3,student1);

        for (Map.Entry<Integer,Student> x: studentMap.entrySet() ) {
            System.out.println(x.toString());
        }

        System.out.println("\n-------------------------\n");

        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student);

        for (Student x: students){
            System.out.println(x.toString());
        }

    }
}
