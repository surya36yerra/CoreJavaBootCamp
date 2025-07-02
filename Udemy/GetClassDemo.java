package Udemy;

public class GetClassDemo {

    public static void main(String[] args) {
        Person p = new Person("test");
        Class c = p.getClass();
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());
        System.out.println(c.getPackageName());

    }
}
