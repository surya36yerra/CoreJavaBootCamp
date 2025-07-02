package java.Preparation.lambda2;//package lambda2;
//
//import java.util.function.Predicate;
//
//public class StringCaseCheck {
//    public static void main(String[] args) {
//
//        String str1 = "UPPERCASE";
//        String str2 = "lowercase";
//        String str3 = "MixedCase";
//        String str4 = "1234";
//
//        Predicate<String> uppercase = s -> s.equals(s.toUpperCase());
//        Predicate<String> lowercase = s -> s.equals(s.toLowerCase());
//        Predicate<String> isMixedCase = s -> !uppercase.test(s) && !lowercase.test(s) && s.matches(".*[a-zA-Z].*");
//
////        System.out.println(str1 + " is uppercase: " + uppercase.test(str1)); // true
////        System.out.println(str2 + " is lowercase: " + lowercase.test(str2)); // true
////        System.out.println(str3 + " is mixed case: " + isMixedCase.test(str3)); // true
////        System.out.println(str4 + " is uppercase: " + uppercase.test(str4)); // false
////        System.out.println(str4 + " is lowercase: " + lowercase.test(str4)); // false
////        System.out.println(str4 + " is mixed case: " + isMixedCase.test(str4)); // false
//    }
//}
