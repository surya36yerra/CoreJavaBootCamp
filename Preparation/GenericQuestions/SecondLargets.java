package java.Preparation.GenericQuestions;

public class SecondLargets {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5 };

        System.out.println(findSecondHigh(array));
    }

    static int findSecondHigh(int[] array) {
        int high = Integer.MIN_VALUE;
        int secondHigh = Integer.MIN_VALUE;
        for(int i:array){
            if(i>high){
                secondHigh = high;
                high = i;
            }
            else if(i>secondHigh){
                secondHigh=i;
            }
        }
        return secondHigh;
    }
}
