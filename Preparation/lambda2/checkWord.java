package java.Preparation.lambda2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class checkWord {
    public static void main(String[] args) {
        List< String > colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");
        String searchword="Red";

        Predicate<String> containsWord = word -> word.equals(searchword);
        containsWord.test(searchword);
        boolean flag = colors.stream().anyMatch(containsWord);
        System.out.println(flag);
    }
}
