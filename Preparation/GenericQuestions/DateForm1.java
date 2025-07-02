package java.Preparation.GenericQuestions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateForm1 {
    public static void main(String[] args) {
        String date = "06-02-2025";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String date2 = sdf.format(new Date());
        System.out.println(date2);
    }
}
