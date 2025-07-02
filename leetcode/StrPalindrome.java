package leetcode;

public class StrPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    static boolean isPalindrome(String s) {
        String s2 = s.replaceAll("[^a-zA-z0-9]","").toLowerCase();
//        String s2 = s.trim();


        System.out.println(s2);
        StringBuilder sb =  new StringBuilder(s2);
       // char cArray[] = s2.toCharArray();
        String s3 = sb.reverse().toString();
        System.out.println(s3);

        return sb.reverse().toString().equalsIgnoreCase(s2);
    }
}
