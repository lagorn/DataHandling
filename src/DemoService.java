import java.time.*;
import java.time.format.DateTimeFormatter;


public class DemoService {
    DateService dateService = new DateService();

    public void execute(){
        //Задание 1.1
        LocalDateTime timeBirth = LocalDateTime.of(1993,7,1,11,45,21,0);
        dateService.youAge(timeBirth);

        LocalDateTime timeBirthLAlex = LocalDateTime.of(1987,10,3,6,0,21,0);
        dateService.myAge(timeBirthLAlex);

        //Задание 1.2
        LocalDate date1 = LocalDate.of(1993,7,2);
        LocalDate date2 = LocalDate.of(1987,10,3);
        System.out.println((dateService.numberDays(date1,date2)) + " дней");

        //Задание 1.3
        String str = "Friday, Aug 10, 2016 12:10:56 PM";
        dateService.DateConversion(str);

    }
}
