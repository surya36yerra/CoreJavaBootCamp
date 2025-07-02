package Optional;

import java.util.Optional;
import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {


        Optional<String> optMessage = sayHello2();
        if (optMessage.isPresent()) {
            System.out.println(optMessage.get().toUpperCase()); // no need for handling NPE
        }

     //   optMessage.ifPresent(msg -> System.out.println("ifPresent-"+msg.toUpperCase()));
        optMessage.ifPresentOrElse(msg -> System.out.println("ifPresent-"+msg.toUpperCase()),
                ()-> System.out.println("value is absent"));

        String msg2 = optMessage.orElse("value is absent");
        System.out.println("orElse:"+msg2);

        String msg3 = optMessage.orElseGet(()->"value is absent");
        System.out.println("orElseGet:"+msg3);
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
