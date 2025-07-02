package java.Preparation.lambda2;

import java.util.function.Function;

public class wordsInSentence {
    public static void main(String[] args) {
        Function<String,Integer> f1 = s->s.split("\\s+").length;
        System.out.println(f1.apply("hello how are u"));

//        Function<String,Integer> f1 = s->s.split("\\s+").length;
    }

}
