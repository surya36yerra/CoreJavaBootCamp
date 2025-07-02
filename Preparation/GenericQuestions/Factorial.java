package java.Preparation.GenericQuestions;

public class Factorial {
    public static void main(String[] args) {
       int a=  findFact(5);
        System.out.println(a);
    }

    static int findFact(int n) {

        return n==1?1:n* findFact(n-1);
    }
}
