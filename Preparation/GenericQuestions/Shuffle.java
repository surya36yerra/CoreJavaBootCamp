package java.Preparation.GenericQuestions;

import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        int []b = shuffle(array);
        for(Integer i : b){
            System.out.println(i);
        }
    }

     public static int[] shuffle(int[] array) {
         Random rand = new Random();
         for(int i=0;i<array.length;i++) {
            int randomIndex = (int) (rand.nextInt(array.length));
            int temp = array[randomIndex];
            array[randomIndex] = array[i];
            array[i] = temp;

        }
         return array;
     }
}
