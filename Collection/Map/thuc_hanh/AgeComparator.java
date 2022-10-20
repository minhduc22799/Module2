package Map.thuc_hanh;

import java.util.Comparator;

public  class AgeComparator implements Comparator<Student1> {


    @Override
    public int compare(Student1 o1, Student1 o2) {
        if (o1.getAge()> o2.getAge()){
            return 1;
        }else if (o1.getAge() == o2.getAge()){
            return 0;
        }
        else {
            return -1;
        }
    }
}
