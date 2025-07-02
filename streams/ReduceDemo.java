package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class ReduceDemo {
    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Engineering");
        departmentList.add("Science");
        departmentList.add("Technology");
        departmentList.add("Computer Science");

        System.out.println(departmentList.stream().count());

        List<Integer> myList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = myList.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        int result1 = myList.stream().mapToInt(num->num).sum();
        int result2 = myList.stream().filter(num->num%2==0).mapToInt(num->num).sum();
        OptionalInt result3 = myList.stream().filter(num->num%2==0).mapToInt(num->num).max();

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3.getAsInt());

    }
}
