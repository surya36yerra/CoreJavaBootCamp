package Preparation.SDET;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverseArray(a);
        System.out.println(Arrays.toString(a));
    }

    static void reverseArray(int []a){

         int start = 0;
         int end = a.length - 1;

         while(start < end){
             int temp = a[start];
             a[start] = a[end];
             a[end] = temp;
             start++;
             end--;
         }

        }
    }

