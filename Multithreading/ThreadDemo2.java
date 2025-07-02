package Multithreading;


public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.start();


        HelloThread1 ht1 = new HelloThread1();
        ht1.start();

        Thread t2 = new Thread(new HelloThread2());
        t2.start();

        Thread t3 = new Thread(HelloThread3::sayHello);
        t3.start();



    }
}
