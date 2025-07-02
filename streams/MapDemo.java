package streams;

import java.util.ArrayList;
import java.util.List;

public class MapDemo {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("A");
        mylist.add("B");
        mylist.add("C");
        mylist.add("D");

        mylist.stream().map(s->s.toLowerCase()).forEach(System.out::println);
        mylist.stream().map(s->s.toLowerCase()).map(s->"Hi"+s).forEach(System.out::println);

    }
}
