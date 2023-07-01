import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Duration;
import java.time.Period;
import java.time.LocalDate;
import java.time.LocalTime;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.of(2023, 10, 9, 14, 0, 0, 0, ZoneId.of("Europe/Paris"));

        LocalTime before = LocalTime.of(9, 0);
        LocalTime after = LocalTime.of(17, 0);
        Duration diff = Duration.between(before, after);

        LocalDate earlier = LocalDate.of(2023, 1, 1);
        LocalDate later = LocalDate.of(2023, 12, 31);
        Period elapsed = Period.between(earlier, later);

        System.out.println(zdt);
        System.out.println(diff);
        System.out.println(elapsed);
    }
}
