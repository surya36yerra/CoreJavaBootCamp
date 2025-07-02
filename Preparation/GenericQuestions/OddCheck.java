package java.Preparation.GenericQuestions;

import java.util.List;

public class OddCheck {
    public static void main(String[] args) {
        List<Integer> list = List.of(11, 21, 31, 41, 51);
        callStream(list);
    }

    static void callStream(List<Integer> list){
        System.out.println(list.stream().anyMatch(x -> x%2!=0));
    }
}
