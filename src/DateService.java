import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

public class DateService {
    public void youAge(LocalDateTime myBirthday){
        System.out.println(myBirthday);
        LocalDateTime dateToday = LocalDateTime.now();
        System.out.println(dateToday);
        Duration timeLive = Duration.between(myBirthday,dateToday);
        System.out.println(timeLive.toDays() + " Days");
        System.out.println(timeLive.toHoursPart()+ " Hours");
        System.out.println(timeLive.toMinutesPart()+ " Minutes");
        System.out.println(timeLive.toSecondsPart()+ " Seconds");
        System.out.println(timeLive.toMillisPart()+ " Millis");
    }
    public void myAge(LocalDateTime myBirthday){
        LocalDateTime dateToday = LocalDateTime.now();

        long years = ChronoUnit.YEARS.between(myBirthday,dateToday);
        long months = ChronoUnit.MONTHS.between(myBirthday,dateToday);
        long weeks = ChronoUnit.WEEKS.between(myBirthday,dateToday);
        long days = ChronoUnit.DAYS.between(myBirthday,dateToday);
        long hours = ChronoUnit.HOURS.between(myBirthday,dateToday);
        long minutes = ChronoUnit.MINUTES.between(myBirthday,dateToday);
        long seconds = ChronoUnit.SECONDS.between(myBirthday,dateToday);
        long milis = ChronoUnit.MILLIS.between(myBirthday,dateToday);

        System.out.print("Вам " + years + " лет " + months +" месяцев " + weeks +" недель " + days + " дней ");
        System.out.println(hours + " часов "+ minutes + " минут " + seconds + " секунд " + milis +" миллисекунд");
    }
    public long numberDays (LocalDate date1,LocalDate date2){
        System.out.println("-------------------------------------------");
        long dayt = ChronoUnit.DAYS.between(date2,date1);
        if(dayt<0){return dayt*-1;}
        return dayt;
    }
    public void DateConversion(String dateString){
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, LLL dd, yyyy HH:mm:ss a");
        LocalDateTime localDateTime = LocalDateTime.parse(dateString);
        localDateTime.format(formatter);
        System.out.println(localDateTime.format(formatter));



//        ZonedDateTime date = ZonedDateTime.parse(dateString).withZoneSameInstant(ZoneId.of("Europe/Samara"));
//        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    }

}
