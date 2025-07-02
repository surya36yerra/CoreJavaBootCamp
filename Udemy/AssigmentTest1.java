package Udemy;

public class AssigmentTest1 {

    public static void main(String[] args) {
        int num1,num2,num3,num4,num5;

        //assignment happens from right to left
         num1=num2=num3=num4=num5=9;
         int dnum1=11;
         int dnum2=12;
         dnum1=dnum2;
        System.out.println(dnum1);
        dnum2=15;
        System.out.println(dnum1);


        Person p1 = new Person("surya");
        Person p2 = new Person("yerra");
        p1=p2;
        System.out.println(p1.name);
        p2.name = "test";
        System.out.println(p1.name);
        p1.name="john";
        System.out.println(p1.name);
        System.out.println(p2.name);

    }
}
