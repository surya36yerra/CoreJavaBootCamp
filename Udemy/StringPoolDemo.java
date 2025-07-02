package Udemy;

public class StringPoolDemo {
    public static void main(String[] args) {


        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hi";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        String obj1 = new String("hello");
        String obj2 = new String("hello");
        String obj3 = new String("hi");
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());

    }
}
