package streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelDemo {
    public static void main(String[] args) {
      Stream<Integer> numStream =   Stream.iterate(1, i -> i + 1).limit(100).parallel();
        System.out.println("starting");

        long start = System.currentTimeMillis();
      numStream.map(num->{
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return num*2;
        }).collect(Collectors.toList());
        long end = System.currentTimeMillis();

        System.out.println(end-start);
        System.out.println("ending");


    }
}
