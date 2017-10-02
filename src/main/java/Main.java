import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+03"));
        System.out.println("With default TZ: " + LocalDateTime.now(TimeZone.getDefault().toZoneId()));
        System.out.println("Without TZ: " + LocalDateTime.now());
        System.out.println("Zoned datetime without TZ: " + ZonedDateTime.now());
        System.out.println("Zoned datetime with TZ: " + ZonedDateTime.now(TimeZone.getDefault().toZoneId()));
        System.out.println("New date: " + new Date());
        System.out.println("Default TZ: " + TimeZone.getDefault().getRawOffset());
    }
}
