package Udemy;

public class Palindrome {
    public static void main(String[] args) {
        String s1 = "sky";
        StringBuffer sb = new StringBuffer(s1);

        String s2 = sb.reverse().toString();


        System.out.println(s1.equalsIgnoreCase(s2)?"palindrome":"not palidrome");

    }

    //        for(int i=s.length()-1;i>=0;i--){
//            sb.append(s.charAt(i));
//        }
    //        System.out.println(sb.toString());


}
