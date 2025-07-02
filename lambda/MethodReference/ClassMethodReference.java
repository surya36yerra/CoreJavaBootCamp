package java.lambda.MethodReference;

import java.util.ArrayList;
import java.util.List;

public class ClassMethodReference {
    public static void main(String[] args) {


        var list = List.of("HR", "sales", "marketing", "supply");
      //  list.forEach(s -> System.out.println(s));

        list.forEach(System.out::println);


    }
}