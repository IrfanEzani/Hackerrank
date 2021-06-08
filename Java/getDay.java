import java.util.*;
import java.time.*;

public class getDay {
    public static void main(String[] args)
    {   
        Scanner s = new Scanner(System.in);
        int month = s.nextInt();
        int day = s.nextInt();
        int year = s.nextInt();
        s.close();
        //format the date (add padding)
        String m = String.format("%02d", month);
        String d = String.format("%02d", day);
        String y = String.format("%04d", year);
        //set date format
        String date = y + "-" + m + "-" + d;
        
        // Parses the date
        LocalDate parsedDate = LocalDate.parse(date);
        // Prints the day
        java.time.DayOfWeek dayOfWeek = parsedDate.getDayOfWeek();
        String x = dayOfWeek.toString();
        System.out.println(x);
    }
}

