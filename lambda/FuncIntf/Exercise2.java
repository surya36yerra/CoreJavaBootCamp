package java.lambda.FuncIntf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Exercise2 {

    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("hello", "world", "java", "lambda");
        transformStringLengths(l1);

    }
    public static List<Integer> transformStringLengths(List<String> strings) {

        // Define a lambda expression using the Function functional interface

        Function<String,Integer> func1 = (s->s.length());


        // Apply the lambda expression to each string in the list
        List<Integer> lenList = new ArrayList<>();
        for(String s:strings){
            lenList.add(func1.apply(s));
        }
        System.out.println(lenList);
        return lenList;
    }

}