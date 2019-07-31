import java.time.*;
import java.time.format.DateTimeFormatter;


public class DemoService {
    DateService dateService = new DateService();

    public void execute(){
        LocalDateTime timeBirth = LocalDateTime.of(1993,7,1,11,45,21,0);

        dateService.youAge(timeBirth);

        LocalDateTime timeBirthLAlex = LocalDateTime.of(1987,10,3,6,0,21,0);
        dateService.myAge(timeBirthLAlex);
    }

}
