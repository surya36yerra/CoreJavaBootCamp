package java.lambda.FuncIntf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Excercie3 {

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        incrementList(l1,9);
    }


    public static List<Integer> incrementList(List<Integer> numbers, int incrementValue) {

        // Define a lambda expression using the UnaryOperator functional interface
        UnaryOperator<Integer> unr1 = s->s+incrementValue;


        // Apply the lambda expression to each integer in the list
        List<Integer> lenList = new ArrayList<>();

        for(Integer i:numbers){
            lenList.add(unr1.apply(i));
        }
        System.out.println(lenList);
        return lenList;

    }

}

