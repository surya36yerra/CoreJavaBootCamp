package Optional;

import java.util.Optional;
import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {


        Optional<String> optMessage = sayHello2();
        if (optMessage.isPresent()) {
            System.out.println(optMessage.get().toUpperCase()); // no need for handling NPE
        }


        String msg2 = optMessage.orElseThrow();
        System.out.println("orElseThrow:"+msg2);

        String msg3 = optMessage.orElseThrow(()-> new IllegalStateException("value is absent"));
        System.out.println("orElseThrowException:"+msg3);
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
