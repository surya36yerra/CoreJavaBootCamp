package leetcode;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter input");
        int input = in.nextInt();
        int result = reverse(input);
        System.out.println(result);
    }

    static int reverse(int x) {

       int reverse = 0;
       while(x!=0)
       {
           int temp = x%10;
           reverse = reverse*10+temp;
           x = x/10;

       }
       return reverse >= Integer.MIN_VALUE && reverse <= Integer.MAX_VALUE?reverse:0;
   }
}



