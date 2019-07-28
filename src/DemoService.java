import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class DemoService {

    public void execute() {

        //Date
        System.out.println("Даты:");

        DateService dateService = new DateService();

        //1.1
        System.out.print("1.1 ");
        dateService.youAge(LocalDateTime.of(1993, 7, 1, 11, 45, 0));

        //1.2
        String str1 = "25.07.2007";
        String str2 = "25.07.2018";
        System.out.printf("1.2 Между %s и %s прошло %d дней\n",
                str1,
                str2,
                dateService.daysBetween(str1, str2)
        );

        //1.3
        str1 = "2016-08-16T23:11:26-11:00";
        System.out.printf("1.3 Конвертация \"%s\" в Ижевское время \"%s\"\n\n",
                str1,
                dateService.convertDate(str1)
        );

        //Other
        System.out.println("Прочее:");

        NumberService numberService = new NumberService();

        //2.1
        double d1 = 6.7;
        System.out.printf("2.1 Площадь круга с радиусом %s равна %s\n",
                new DecimalFormat("0.#######").format(d1),
                numberService.circleSquare(d1).toString()
        );

        //2.2
        str1 = "0.1";
        str2 = "0.15";
        String str3 = "0.25";
        System.out.printf("2.2 Даны три числа: %s, %s и %s. Третье число%sявляется суммой первых двух\n",
                str1, str2, str3,
                numberService.isThirdSumOfFirstTwo(str1, str2, str3) ? " " : " НЕ ");

        //2.3
        int i1 = 4;
        int i2 = 35;
        int i3 = -10;
        System.out.printf("2.3 Даны три числа: %d, %d и %d. Минимальное: %d Максимальное: %d\n\n",
                i1, i2, i3,
                numberService.findMin(i1, i2, i3),
                numberService.findMax(i1, i2, i3)
        );
    }
}
