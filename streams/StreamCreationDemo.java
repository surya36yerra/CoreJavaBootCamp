package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamCreationDemo {
    public static void main(String[] args) {
        List<String> deptList = new ArrayList<>();
        deptList.add("marketing");
        deptList.add("sales");
        deptList.add("supply");
        deptList.add("HR");

        Stream<String> deptStream = deptList.stream();
      //  deptStream.forEach(dept -> System.out.println(dept));
        deptStream.parallel();//converts normal to parallel
        deptStream.forEach(System.out::println);
        System.out.println("******************");

        Stream<String> inStream = Stream.of("easy","bytes","java");
        inStream.forEach(System.out::println);

        Stream<String> inStream2 = deptList.parallelStream();
        inStream2.forEach(System.out::println);

        System.out.println("******************");
        String[] words = {"eazy","bytes","1","2","3"};
        Stream<String> s1 = Arrays.stream(words);
        Stream<String> s2 = Arrays.stream(words,0,4);
        System.out.println(s2);
        System.out.println("******************");

        //infinite stream
        Stream<String> s3 = Stream.empty();
        Stream.generate(new Random()::nextInt).limit(1).forEach(System.out::println);
        Stream.iterate(1,n->n+1).limit(1).forEach(System.out::println);




    }
}
