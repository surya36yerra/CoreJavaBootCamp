package lambda.FuncIntf;

import java.time.LocalDate;
import java.util.function.*;

public class BiPredicateDemo {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> isLess = (a, b) -> a < b;
        System.out.println(isLess.test(4,9));

        BiFunction<Double, Double,Double> power = (a, b) -> Math.pow(a,b);
        System.out.println(power.apply(2.0,3.0));

        BiConsumer<String, String> concat =  (word1,word2)-> System.out.println((word1+word2).toUpperCase()) ;
         concat.accept("surya","yerra");

        BinaryOperator<Double> plus = (a,b) -> a+b;
        System.out.println(plus.apply(2.0,3.0));

        BinaryOperator<Integer> max = BinaryOperator.maxBy((a,b) -> Integer.compare(a,b));
        System.out.println(max.apply(16,13));

        BinaryOperator<Integer> min = BinaryOperator.minBy((a,b) -> Integer.compare(a,b));
        System.out.println(min.apply(16,13));
    }
}
