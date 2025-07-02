package Optional;

import java.util.Optional;
import java.util.Random;

public class Demo4 {
    public static void main(String[] args) {


        Optional<String> optMessage = sayHello2();
        if (optMessage.isPresent()) {
            System.out.println(optMessage.get().toUpperCase()); // no need for handling NPE
        }

//        Optional<String> str = optMessage.map(input->input.toUpperCase());
//        System.out.println(str);

        Optional<String> str2 = optMessage.filter(input->input.length()>5);
        System.out.println(str2);
    }


    public static Optional<String> sayHello2() {
       int num = new Random().nextInt();
        System.out.println(num);
        if(num%2==0){
            return Optional.of("Hello world");
        }
        return Optional.empty();
    }


}
