package java.Multithreading;

import Multithreading.SumOfInts;

public class SumOfIntsDemo {
    public static void main(String[] args) throws InterruptedException {
        long start =  System.currentTimeMillis();
        long result  =0;

        SumOfInts thread1 = new SumOfInts(0,Integer.MAX_VALUE/2);
        SumOfInts thread2 = new SumOfInts((Integer.MAX_VALUE/2)+1,Integer.MAX_VALUE/2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        result = thread1.getResult()+thread2.getResult();
        System.out.println(result);
        long end =  System.currentTimeMillis();
        System.out.println("total time: " + (end-start));

    }
}
