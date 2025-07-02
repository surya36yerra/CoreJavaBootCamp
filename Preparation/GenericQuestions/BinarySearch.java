package java.Preparation.GenericQuestions;

public class BinarySearch {
    public static void main(String[] args) {

        int key=54;
        int []a = new int[]{1,2,9,8,7,6,54,11};
       int i =  binarySeaarch(a, key);
        System.out.println(i);
    }


     static int binarySeaarch(int[] a, int key){
        int low =a[0];
        int high =a[a.length-1];
        int mid = (low+high)/2;

        while(low <= high){
            if(a[mid]<key){
                low = mid+1;
            }
            else if(a[mid]==key){
                return mid;
            }
            else {
                high = mid-1;
        }
            mid = (low+high)/2;
        }
        if(low>high){
            return -1;
        }
        return -1;
    }


}
