//package Udemy;
//
//public class DeepClone implements Cloneable {
//
//    public static void main(String[] args) {
//        Course math = new Course();
//        math.setCourseName("Math");
//
//        Student original = new Student("Alice",math);
//        Student clonedStudent =  (Student)original.clone();
//
//        System.out.println(original==clonedStudent);
//        System.out.println(original.getCourse()==clonedStudent.getCourse());
//
//    }
//    private String name;
//    private String course;
//
//    public DeepClone(String name, Udemy.Course) {
//        this.name = name;
//        this.course = course;
//    }
//
//@Override
//    public Object clone() throws CloneNotSupportedException {
//        Student cloneStudent = (Student) super.clone();
//        cloneStudent.course = (Course)course.clone();//deep cloning nested object
//        return cloneStudent;
//    }
//
//
//
//
//
//
//}
