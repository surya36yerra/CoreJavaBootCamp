package streams;

import java.util.Random;
import java.util.stream.Stream;

public class limitDemo {
    public static void main(String[] args) {

        Stream.generate(new Random()::nextInt).limit(10).map(n->n*2).forEach(System.out::println);
    }
}
