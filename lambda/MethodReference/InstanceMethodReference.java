//package java.lambda.MethodReference;
//
//public class InstanceMethodReference {
//    public static void main(String[] args) {
//
//
////        ArithmeticOperation operation = (a, b) -> {
////            int sum = a + b;
////            System.out.println(sum);
////            return sum;
////        };
////        operation.performOperation(2, 3);
//
//        InstanceMethodReference instanceMethodReference=new InstanceMethodReference();
//        ArithmeticOperation methodReference = instanceMethodReference::performAddition;
//        ArithmeticOperation methodReference2 = instanceMethodReference::performSbtraction;
//
//        methodReference.performOperation(20,3);
//        methodReference2.performOperation(20,3);
//
//    }
//
//    public  int performAddition(int a, int b) {
//        int sum = a + b;
//        System.out.println(sum);
//        return sum;
//    }
//    public  int performSbtraction(int a, int b) {
//        int diff = a - b;
//        System.out.println(diff);
//        return diff;
//    }
//}
