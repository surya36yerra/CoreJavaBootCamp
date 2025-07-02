package java.Preparation.lambda2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSquares {
    public static void main(String[] args) {
        List< Integer > nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(nums.stream().filter(x -> x % 2 == 0).mapToInt(n->n*n).sum());
        System.out.println(nums.stream().filter(x -> x % 2 != 0).mapToInt(n->n*n).sum());

    }
}
