package time;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class demotest3 {
    public static void main(String[] args) {
        // ZonedDateTime londonStartTime, londonEndTime, newYorkStartTime,newYorkEndTime;

        // Write your logic below
        ZonedDateTime londonStartTime = ZonedDateTime.of(2024, 10, 15, 14, 0, 0, 0, ZoneId.of("Europe/London"));

        // Conference call expected end time (assuming 2 hours duration)
        ZonedDateTime londonEndTime = londonStartTime.plusHours(2);

        // Convert the London times to New York times
        ZonedDateTime newYorkStartTime = londonStartTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime newYorkEndTime = londonEndTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("Conference Call Start Time (London): " + londonStartTime);
        System.out.println("Conference Call End Time (London): " + londonEndTime);
        System.out.println("Conference Call Start Time (New York): " + newYorkStartTime);
        System.out.println("Conference Call End Time (New York): " + newYorkEndTime);
    }

}

