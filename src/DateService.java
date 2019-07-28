import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateService {

    public void youAge(LocalDateTime birthTime) {

        LocalDateTime currentTime = LocalDateTime.now();

        System.out.printf(Locale.US, "С момента рождения прошло: %d лет, %d месяцев, %,d дней, %,d часов, %,d минут, %,d секунд\n",
                ChronoUnit.YEARS.between(birthTime, currentTime),
                ChronoUnit.MONTHS.between(birthTime, currentTime),
                ChronoUnit.DAYS.between(birthTime, currentTime),
                ChronoUnit.HOURS.between(birthTime, currentTime),
                ChronoUnit.MINUTES.between(birthTime, currentTime),
                ChronoUnit.SECONDS.between(birthTime, currentTime)
        );
    }

    public long daysBetween(String firstDateStr, String secondDateStr) {

        DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate firstDate = LocalDate.parse(firstDateStr, format);
        LocalDate secondDate = LocalDate.parse(secondDateStr, format);

        return  ChronoUnit.DAYS.between(firstDate, secondDate);
    }

    public String convertDate (String dateStr) {

        ZonedDateTime date = ZonedDateTime.parse(dateStr).withZoneSameInstant(ZoneId.of("Europe/Samara"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return date.format(formatter);
    }
}
