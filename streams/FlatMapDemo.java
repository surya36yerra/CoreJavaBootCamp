package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {

        String[] arrayWords = {"Eazy","Bytes"};
        Stream<String> streamOfWords = Arrays.stream(arrayWords);

        Stream<String[]> myStream = streamOfWords.map(word -> word.split(""));
        myStream.flatMap(Arrays::stream).forEach(System.out::println);
//        myStream.forEach(System.out::println);

        List<Person> personList = Arrays.asList(new Person("Alice",Arrays.asList("123","456"))
                                            ,new Person("Bob",Arrays.asList("789","101","112")));
        List<List<String>> mapResult = personList.stream().map(Person::getPhoneNumbers).collect(Collectors.toList());
        System.out.println(mapResult);

        List<String> flatMapResult = personList.stream().flatMap(person -> person.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(flatMapResult);


    }
}
