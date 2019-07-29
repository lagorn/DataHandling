import java.time.*;
import java.time.format.DateTimeFormatter;

public class DemoService {
    public void execute(){
        System.out.println("ПУсто");
    }
    public void HowOldIam(){
        LocalDate timenow = LocalDate.now();
        System.out.println(timenow);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse("01.07.1993", formatter);
        LocalDate endDate = LocalDate.parse("05.03.2013", formatter);
        Period period = Period.between(startDate, timenow);
        System.out.println("Прошло " + period.getYears()+ " года.");
        System.out.println("Прошло " + period.getMonths()+ " месяца.");
        System.out.println("Прошло " + period.getDays()+ " дня.");

        LocalDateTime timenow_new = LocalDateTime.MIN.now();
        System.out.println(timenow_new);
    }

}
