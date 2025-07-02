package leetcode;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
        static boolean isAnagram(String s, String t) {
            char[] c1 = s.toCharArray();
            char[] c2 = t.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            if(Arrays.equals(c1,c2)){
                return true;
            }
            return false;

        }
}
