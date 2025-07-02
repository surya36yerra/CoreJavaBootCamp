package Udemy;

import java.util.LinkedHashMap;
import java.util.Map;

class Test1 {
    static Map<Integer,Integer> myMap;
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        myMap =  getComputatedLimits(25060);
        for(Map.Entry<Integer,Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

  static   Map<Integer, Integer>  getComputatedLimits(int totalCount){
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int limit = (totalCount / 10);
        int upperlimit = totalCount % 10;
        for (int count = 1; count <= limit; count++) {
            int counter = count * 10;
            if (count == 1) {
                map.put(1, counter);
            } else {
                map.put((counter - 10 + 1), counter);
            }
        }
        int size = map.size();
        if (upperlimit != 0 && upperlimit < 10) {
            int lower = (size * 10 + 1);
            int upper = (size * 10 + 10);
            map.put(lower, upper);
        }
        return map;
    }
}
