import java.time.*;
import java.time.format.DateTimeFormatter;

public class DemoService {
    public void execute(){
        LocalDate timenow = LocalDate.now();
        System.out.println(timenow);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse("01.07.1993", formatter);
        LocalDate endDate = LocalDate.parse("05.03.2013", formatter);
        Period period = Period.between(timenow, startDate);
        System.out.println("Прошло " + period.getYears()+ " года.");
        System.out.println("Прошло " + period.getMonths()+ " месяца.");
        System.out.println("Прошло " + period.getDays()+ " дня.");
    }
}
