package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class UniqChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter input");
        String str = in.nextLine();
        int a  = firstUniqChar(str);
        System.out.println("position of first non-repeated char is "+a);
    }


    static int firstUniqChar(String s) {
        char charArray[] = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            if (map.containsKey(charArray[i])) {
                map.put(charArray[i],-1);
            } else {
                map.put(charArray[i], i);
            }
        }

        int max = Integer.MAX_VALUE;
        for(char c:charArray){
            if(map.get(c)>-1 && map.get(c)<max){
                max = map.get(c);
            }

        }
        return max==Integer.MAX_VALUE? -1:max;
    }
}
