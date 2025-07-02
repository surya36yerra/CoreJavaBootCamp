package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Engineering");
        departmentList.add("Science");
        departmentList.add("Technology");
        departmentList.add("Computer Science");
        departmentList.add("social");


        List<String> collect1 = departmentList.stream().filter(s->s.startsWith("s")).collect(Collectors.toList());
        long collect2 = departmentList.stream().filter(s -> s.startsWith("s")).count();
        Set<String> collect3 = departmentList.stream().filter(s->s.startsWith("s")).collect(Collectors.toCollection(TreeSet::new));

        System.out.println(collect1);
        System.out.println(collect2);
        System.out.println(collect3);


     //   departmentList.stream().
    }
}
