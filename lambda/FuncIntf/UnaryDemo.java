package java.lambda.FuncIntf;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryDemo {
    public static void main(String[] args) {

        UnaryOperator<String> func1 = (s->s.toUpperCase());
        System.out.println(func1.apply("hello"));


        //static
        UnaryOperator<String> func3 = UnaryOperator.identity();
        System.out.println(func3.apply("hello"));

        UnaryOperator<Integer> func4 = num->num*2;
        UnaryOperator<Integer> func5 = num->num+3;

        Function<Integer,Integer> output1 = func4.andThen(func5);
        Function<Integer,Integer> output2 = func4.compose(func5);
        System.out.println(output1.apply(5));
        System.out.println(output2.apply(5));

    }
}


