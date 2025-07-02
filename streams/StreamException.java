package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamException {
    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Engineering");
        departmentList.add("Science");
        departmentList.add("Technology");
        departmentList.add("Computer Science");


        Stream<String> stream = departmentList.stream();
        stream.forEach(System.out::println);

        stream.forEach(System.out::println);

    }
}
