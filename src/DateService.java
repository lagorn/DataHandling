import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

public class DateService {
    public void youAge (/*LocalDateTime myBirthday*/) {
        Date timenow = new Date();

        SimpleDateFormat formatForDate = new SimpleDateFormat("'Эра 'G dd-MM-yyyy 'и время: ' HH:mm:ss:SSS");

        System.out.println(formatForDate.format(timenow));

    }
}
