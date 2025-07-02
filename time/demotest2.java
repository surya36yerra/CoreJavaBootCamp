package time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class demotest2 {

    public static void main(String[] args) {
        localDateOperations();
        localTimeOperations();
        localDateTimeOperations();
    }

     static LocalDate localDateOperations() {
            LocalDate localDate = LocalDate.of(2025, 12 , 25);
            LocalDate newDate = localDate.plusMonths(6).plusDays(18);
    return newDate;
    }

    public static LocalTime localTimeOperations(){
            LocalTime localTime = LocalTime.of(14, 30, 45);
            LocalTime newLocalTime = localTime.minusHours(2).minusSeconds(15);
        return newLocalTime;
    }

    public static LocalDateTime localDateTimeOperations() {
            LocalDateTime localDateTime = LocalDateTime.of(2025,12,25,9,30);
            LocalDateTime newLocalDateTime = localDateTime.minusWeeks(4).minusMinutes(30);
    return newLocalDateTime;
    }

}
