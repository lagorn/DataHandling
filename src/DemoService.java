import java.time.*;
import java.time.format.DateTimeFormatter;


public class DemoService {
    DateService dateService = new DateService();

    public void execute(){
        LocalDateTime timeBirth = LocalDateTime.of(1993,7,1,11,45,0,0);
        dateService.youAge(timeBirth);
    }
}
