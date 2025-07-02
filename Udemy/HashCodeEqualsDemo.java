package Udemy;

public class HashCodeEqualsDemo  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("John",563421,25);
        Person p2 = new Person("John",563422,25);

        Person p3 = (Person) p1.clone();
        System.out.println(p3.getName());
        p3.setName("will smith");
        System.out.println(p3.getName());


        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1.equals(p2));
        System.out.println(p1);
        System.out.println(p2);



    }
}
