package streams;

import java.util.List;
import java.util.ArrayList;

public class FilterDemo {
    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Engineering");
        departmentList.add("Science");
        departmentList.add("Technology");
        departmentList.add("Computer Science");

        departmentList.stream()
                .map(String::toUpperCase)
                .filter(word->word.startsWith("S")).forEach(System.out::println);

    }
}
