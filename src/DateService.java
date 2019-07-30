import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

public class DateService {

    public void youAge(LocalDateTime myBirthday){
        System.out.println(myBirthday);
        Instant dateToday = Instant.now();
        System.out.println(dateToday);



    }
}
