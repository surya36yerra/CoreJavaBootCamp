package lambda.FuncIntf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<String> consumerTest = x -> System.out.println(x.toUpperCase());
        consumerTest.accept("Hello");

        Consumer<Integer> consumer1 = x -> System.out.println(x*x);
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        list1.forEach(consumer1);

        Consumer<String> appendInput = x -> System.out.println("new value is:HELLO"+x);
        appendInput.andThen(consumerTest).accept(" lambda");

      //  executes appendInput first and then executes consumerTest
    }

}
