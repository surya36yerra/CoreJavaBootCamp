package java.Preparation.SDET;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String s1 = "list", s2 = "tils";
        Arrays.sort(s1.toCharArray());
        Arrays.sort(s2.toCharArray());
        System.out.println(s1.equals(s2));

        boolean b = checkAnagram(s1, s2);
        System.out.println(b);
    }

    static boolean checkAnagram(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        if (s1.length() != s2.length()) {
            return false;
        }

        int count = 0;
        for (int i = 0; i < ch1.length; i++) {
            if (s2.contains(String.valueOf(ch1[i]))) {
                count++;
            }
        }
        if (count == ch1.length) {
            return true;
        }
        return false;
    }
}
