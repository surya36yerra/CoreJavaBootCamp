package Udemy;

public class StringIntern {

    public static void main(String[] args) {


        String s1 = "hello";
        String s2 = new String("hello").intern();
        System.out.println(s1 == s2);

        String s = "\u004Dadan\u0021";
        System.out.println(s);
    }
}
