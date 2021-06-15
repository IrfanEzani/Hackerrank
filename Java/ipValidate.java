import java.util.*;
import java.util.regex.*;



   
public class ipValidate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String regex255 = "([0-9]{1,2}|(0|1)[0-9]{2}|2[0-4][0-9]|25[0-5])";
        String finalregex = regex255 + "\\." + regex255 + "\\." + regex255 + "\\." + regex255;
        Pattern p = Pattern.compile(finalregex);

        /*  
            [0-9]{1,2} = 0 to 9, atleast once, atmost twice (catches one and two digit numbers)
            (0|1)[0-9]{2} = start with 0/1, followed by atmost twice of 0-9
            2[0-4][0-9] = 200 to 249
            25[0-5] = 250 to 255
        */
        while(in.hasNext()){
            String IP = in.next();
            Matcher m = p.matcher(IP);
            System.out.println(m.matches());
        }
        in.close();
    }
}


