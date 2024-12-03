import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        printDate(1);
        printDate(2);
        printDate(3);
    }

    public static void printDate(int patternNimber){
        String pattern;
        switch (patternNimber){
            case 1->pattern="dd/MM/yyyy";
            case 2->pattern="yyyy-MM-dd HH:mm:ss";
            case 3->pattern="EEE MMM dd yyyy";
            default ->{
                pattern="yyyy/MM/dd";
                System.out.println("the selected format is not supported, the standard date display format is set");
            }
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }
}
