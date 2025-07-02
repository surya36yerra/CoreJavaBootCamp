package NewFeatures;

public class SwitchNewTest {


    public static void main(String[] args) {
        String day = "FRIDAY";

        int numletters = switch (day){
            case "MONDAY","FRIDAY","SUNDAY"-> {System.out.println(5);yield 51;}
            case "TUESDAY"->{ System.out.println(2); yield 2;}
            case "WEDNESDAY"-> {System.out.println(1); yield 1;}
            case "THURSDAY"->{ System.out.println(2); yield 2;}
            case "saturday"-> {System.out.println(3); yield 3;}
            default -> {System.out.println("Invalid day");yield 0;}
        };

    }
}


