package java.Preparation.lambda2;

import java.util.stream.IntStream;

public class SumOfPrime {

    public static int sumPrimes(int limit) {
        return IntStream.rangeClosed(100, 200)
                .filter(SumOfPrime::isPrime)
                .sum();
    }


    public static boolean isPrime(int number) {
        return number > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(i -> number % i == 0);
    }

    public static void main(String[] args) {
        int limit = 50;
        int sum = sumPrimes(limit);
        System.out.println("The sum of prime numbers up to " + limit + " is: " + sum);
    }
}
