package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class UserTest1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(7);

        System.out.println(list.stream().mapToInt(i->factorial(i)).sum());


    }


     static int factorial(int n){
        if(n == 1){return 1;}
        else{
            System.out.println(n * factorial(n-1));
            return n * factorial(n-1);
        }
     }
}
