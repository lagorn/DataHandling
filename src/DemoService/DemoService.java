package DemoService;
import Servise.DateService;
import Servise.NumericalOperations;
import java.time.*;


public class DemoService {
    DateService dateService = new DateService();

    public void executeTask1(){
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
        String str = "Wednesday, Aug 10, 2016 12:10:56 PM";
        dateService.DateConversion(str);
    }
    public void executeTask2(){
        //Задание 2.1
        NumericalOperations numericalOperations = new NumericalOperations();

        numericalOperations.circleArea(5);

        //Задание 2.2
        String str = "0.1, 0.15 и 0.25";
        numericalOperations.numberFromString(str);
    }
}
