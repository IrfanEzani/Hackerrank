import java.util.*;
import java.text.*;

public class timeConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        s.close();

      DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
      //Desired format: 24 hour format: Change the pattern as per the need
      DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
      Date date = null;
      String output = null;
      try{
         //Converting the input String to Date
    	 date= df.parse(input);
         //Changing the format of date and storing it in String
    	 output= outputformat.format(date);
         System.out.println("date after format: " + output);
         //Displaying the date
      }catch(ParseException pe){
         pe.printStackTrace();
       }
    }
}
