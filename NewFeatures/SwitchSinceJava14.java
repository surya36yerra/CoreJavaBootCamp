package NewFeatures;

public class SwitchSinceJava14 {


    public static void main(String[] args) {
        String fruit = "test";
        switch (fruit) {
            case "apple","greenapple"-> System.out.println("Apple");
            case "orange"-> System.out.println("Orange");
            case "banana"-> System.out.println("Banana");
            case "grape"-> System.out.println("Grape");
            default -> System.out.println("Unknown fruit");
        }
        String fruitNew = "grape";
        String test = switch (fruitNew) {
            case "apple","greenapple"-> "Apple";
            case "orange"->"Orange";
            case "pineapple"-> "pineapple";
            case "grape"-> {System.out.println("grape");yield "grape";}
            default -> "Unknown fruit";
        };
        System.out.println(test);
    }
}


