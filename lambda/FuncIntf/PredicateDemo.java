package lambda.FuncIntf;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (num)->num%2==0;
        System.out.println(isEven.test(16));
     //   System.out.println(isEven.test("16"));

        Predicate<Integer> isGreaterThan50 = (num)->num>50;
        System.out.println(isGreaterThan50.test(61));

        System.out.println((isEven.and(isGreaterThan50).test(16)));
        System.out.println((isEven.or(isGreaterThan50).test(60)));
        System.out.println((isEven.negate().test(63)));

        //static methods
        Predicate<Integer> isOdd = Predicate.not(isEven);
        System.out.println(("not function:"+isOdd.test(3)));

        Predicate<String> checkEqual = Predicate.isEqual("easy bytes");
        System.out.println(checkEqual.test("easy"));

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evenList = list1.stream().filter(isEven).collect(Collectors.toList());
        List<Integer> evenList2 = list1.stream().filter(x->x%2==0).collect(Collectors.toList());

        System.out.println(evenList2);



    }
}
