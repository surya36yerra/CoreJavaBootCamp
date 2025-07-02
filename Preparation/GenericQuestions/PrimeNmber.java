package java.Preparation.GenericQuestions;

public class PrimeNmber {
    public static void main(String[] args) {

     boolean b=   isPrime(1);
        System.out.println(b);
    }

    static boolean isPrime(int n) {
        if(n==0 || n==1) return false;
        if(n==2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
