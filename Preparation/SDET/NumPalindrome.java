package Preparation.SDET;

public class NumPalindrome {
    public static void main(String[] args) {
        numPalindrome(123);
    }

     static void numPalindrome(int n) {

        int rev = 0;
        while(n!=0){
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;

        }
         System.out.println(rev);


     }
}
