package Udemy;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortingDemo {
    public static void main(String[] args) {
        var students = new ArrayList<Student1>();
        students.add(new Student1("john",1,97));
        students.add(new Student1("jacob",2,98));
        students.add(new Student1("john",3,99));
        System.out.println(students);
        Collections.sort(students);

    }
}
