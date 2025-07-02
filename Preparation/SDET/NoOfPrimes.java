package Preparation.SDET;

import org.w3c.dom.ls.LSOutput;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NoOfPrimes {
    public static void main(String[] args) {
        listPrimes();
        directMethod();

    }

    static void listPrimes() {
        Long starTime1 = System.currentTimeMillis();
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Total number of prime numbers between 1 and 100: " + count);
        Long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken using listPrimes method: " + (endTime1 - starTime1) + " milliseconds");
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; // Not a prime number
        }
        return true;
    }

    static void directMethod() {
        Long starTime2 = System.currentTimeMillis();
        System.out.println("using direct method");

        List<Integer> list = IntStream.rangeClosed(2, 100).filter(n -> IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0)).boxed().collect(Collectors.toList());
        list.forEach(System.out::println);
        Long endTime2 = System.currentTimeMillis();
        System.out.println("Time taken using directMethod method: " + (endTime2 - starTime2) + " milliseconds");

    }
}
