package java.Preparation.lambda2;

import java.util.function.Predicate;

public class PerfectSquare {
    public static void main(String[] args) {
        int n = 18;
        Predicate<Integer> predicate = x -> {
           int sqrt = (int)Math.sqrt(x);
           return sqrt * sqrt == x;
        };
        System.out.println(predicate.test(n));
    }
}
