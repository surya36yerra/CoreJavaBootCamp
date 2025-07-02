package Optional;

import java.util.Optional;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        //  String message = sayHello();
//        if(message!=null){
//            System.out.println(message.toUpperCase());
//        }


        Optional<String> optMessage = sayHello2();
//        if(!optMessage.isEmpty()){}
        if (optMessage.isPresent()) {
            System.out.println(optMessage.get().toUpperCase()); // no need for handling NPE
        }
    }

    public static String sayHello() {
        return "Hello world";
    }

    public static Optional<String> sayHello2() {
       int num = new Random().nextInt();
        System.out.println(num);
        if(num%2==0){
            return Optional.of("Hello world");
        }
        return Optional.empty();
    }

    public static Optional<String> sayHello3() {
        int num = new Random().nextInt();
        System.out.println(num);
        String msg = null;
        if(num%2==0){
            msg = "Hi World";
        }
        return Optional.ofNullable(msg);
    }
}
