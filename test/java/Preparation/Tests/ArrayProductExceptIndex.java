package Preparation.Tests;


public class ArrayProductExceptIndex {
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 1, 0};
        System.out.println("no of 1s is " + getOneCount(array));
        int[] productArray = productExceptIndex(array);
        System.out.print("Product except index: ");
        for (int product : productArray) {
            System.out.print(product + " ");
        }
    }


    static int getOneCount(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i == 1) {
                count++;
            }
        }
        return count;
    }

    // Method to calculate product except the index
    static int[] productExceptIndex(int[] array) {
        int totalProduct = 1;
        int zeroCount = 0;
        for (int num : array) {
            if (num != 0) {
                totalProduct *= num;
            } else {
                zeroCount++;
            }
        }

        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (zeroCount > 1) {
                result[i] = 0;
            } else if (zeroCount == 1) {
                result[i] = (array[i] == 0) ? totalProduct : 0;
            } else {
                result[i] = totalProduct / array[i];
            }
        }
        return result;
    }
}







