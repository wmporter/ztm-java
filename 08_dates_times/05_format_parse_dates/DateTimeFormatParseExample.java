import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class DateTimeFormatParseExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy--h:m a");
        String dateString = dateTimeFormatter.format(now);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM dd yyyy");
        LocalDate ld = LocalDate.parse("November 21 2023", dateFormatter);

        System.out.println(dateString);
        System.out.println(ld);
    }
}
