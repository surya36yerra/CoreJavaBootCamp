package Preparation.SDET;

import java.util.stream.IntStream;

public class Prime {
    public static void main(String[] args) {
        int n = 29; // Example number to check if it's prime
        boolean isPrime = checkPrime(n);
        System.out.println(n + " is prime: " + isPrime);
    }

    static boolean checkPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; // Found a divisor, not prime
        }
        return true; // No divisors found, it's prime
    }

}
