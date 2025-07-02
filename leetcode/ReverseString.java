package leetcode;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter input");
        char str[] = in.next().toCharArray();
        reverseString(str);
    }
    public static void reverseString(char[] s) {

        int begin=0;
        int end = s.length-1;
        char temp;

        while(begin<end) {
            temp = s[begin];
            s[begin]=s[end];
            s[end] = temp;
            begin++;
            end--;
        }
        System.out.println(s);
    }

}

