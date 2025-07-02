package java.Preparation.GenericQuestions;

public class FibonacciRec {
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            System.out.println(fibonacci(i)+"");
        }
    }


    static int fibonacci(int n) {
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
        }
    }

