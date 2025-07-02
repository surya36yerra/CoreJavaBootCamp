package Preparation.Tests;

public class IntReverse {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverseInt(number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

     static int reverseInt(int n) {
        int rev = 0;
        while(n!=0){
            int rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }

        System.out.println("Reversed Number: " + rev);
        return rev >= Integer.MIN_VALUE || rev <= Integer.MAX_VALUE? rev:0;
     }
}
