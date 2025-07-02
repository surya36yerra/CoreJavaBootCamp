package java.Preparation.GenericQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayCheck {
    public static void main(String[] args) {
        Integer[] a1 = {1,2,3,2,1};
        Integer[] a2 = {1,2,3};
        Integer[] a3 = {1,2,3,4};
        System.out.println(sameElements(a1, a2));
        System.out.println(sameElements(a1, a3));
    }


     static boolean sameElements(Integer[] a1, Integer[] a2) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(a1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(a2));
        if(set1.size() != set2.size()) return false;
        return set1.equals(set2);
     }
}
