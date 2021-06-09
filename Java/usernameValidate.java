import java.util.regex.*;
import java.util.*;

public class usernameValidate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        // consume nextline
        s.nextLine();

        String[] matches = new String[length];
        for (int i = 0; i < matches.length; i++) {
            matches[i] = s.nextLine();
        }
        s.close();
        
        Pattern pattern = Pattern.compile("^[a-zA-Z]\\w{7,29}$", Pattern.CASE_INSENSITIVE);
        for (int i = 0; i < matches.length; i++) {
            Matcher matcher = pattern.matcher(matches[i]);
            boolean matchFound = matcher.find();
            if (matchFound) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
