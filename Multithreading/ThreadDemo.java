package Multithreading;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.start();

     //   t1.start(); - cant start same thread twice

        Thread t2 = new Thread(()-> System.out.println("hello from java thread"));
    //    t2.start();
        t2.run();

        Runnable r1 = ()-> System.out.println("hello from runnable");
        Thread t3 = new Thread(r1);
      //  t3.start();
        t3.run();

        System.out.println("hello from main thread");
    }
}
