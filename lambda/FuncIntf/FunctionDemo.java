package java.lambda.FuncIntf;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        Function<String,String> func1 = (s->s.toUpperCase());
        System.out.println(func1.apply("hello"));

        Function<String,Integer> func2 = (s->s.length());
        System.out.println(func2.apply("hello"));

        //static
        Function<String, String> func3 = Function.identity();
        System.out.println(func3.apply("hello"));

        Function<Integer,Integer> func4 = num->num*2;
        Function<Integer,Integer> func5 = num->num+3;

        Function<Integer,Integer> output1 = func4.andThen(func5);
        Function<Integer,Integer> output2 = func4.compose(func5);
        System.out.println(output1.apply(5));
        System.out.println(output2.apply(5));

    }
}
