package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class demotest1 {
    public static void main(String []args) {
        TimeZone newYorkTimeZone = TimeZone.getTimeZone("America/New_York");
        Calendar calendar = new GregorianCalendar(newYorkTimeZone);
        // Set the date and time
        calendar.set(Calendar.YEAR, 2026);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        calendar.set(Calendar.HOUR_OF_DAY, 11);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        // Display the date and time in New York time zone
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(newYorkTimeZone);
        String formattedDate = dateFormat.format(calendar.getTime());
        System.out.println(formattedDate);

}
}
