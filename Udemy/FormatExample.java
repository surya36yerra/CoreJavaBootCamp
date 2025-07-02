package Udemy;

public class FormatExample {
    public static void main(String[] args) {
        String message = "Hello %s!You have %5d messages";
        String msg2 = String.format(message,"madan",3);
        System.out.println(msg2);

        String message2 = "My name is %3$s,I am %2$d years old,and I live in %1$s.";
        String res = String.format(message2,"NewYork",25,"Nitin");
        System.out.println(res);

        String s2 = String.format("Name is:%s,Age:%d","Madan",25);
        System.out.println(s2);

        System.out.printf("Name:%s,Age:%d","Madan",25);

        String item = "bananas";
        int quantity = 7;
        double pricePerUnit = 1.99;
        // Write your code below

        System.out.printf("Don't forget to buy %d %s at %.2f each",quantity,item,pricePerUnit);


    }
}
