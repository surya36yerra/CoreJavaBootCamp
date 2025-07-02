package Udemy;

public class Student1 implements Comparable<Student1>

{
        private String name;
        private int rollNo;
        private int marks;

    public Student1(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", marks=" + marks +
                '}';
    }
//
//    @Override
//    public int compareTo(Student1 o) {
//       return Integer.compare(this.marks, o.marks);
//    }

    @Override
    public int compareTo(Student1 o) {
        int marksCompare = Integer.compare(this.marks, o.marks);
        if(marksCompare == 0) {
            return Integer.compare(this.rollNo, o.rollNo);

        }
        return marksCompare;
    }
}
