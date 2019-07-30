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
        LocalDateTime dateToday = LocalDateTime.now();
        System.out.println(dateToday);
        Duration timeLive = Duration.between(myBirthday,dateToday);
        System.out.println(timeLive.toDays());
        System.out.println(timeLive.toHoursPart());
        System.out.println(timeLive.toMinutesPart());
        System.out.println(timeLive.toSecondsPart());
        System.out.println(timeLive.toMillisPart());






    }
}
