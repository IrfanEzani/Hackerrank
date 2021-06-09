import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class syntaxChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        s.nextLine();
        String[] arr = new String[length]; 
        for(int i = 0; i < length; i++) {
            arr[i] = s.nextLine();
        }
        s.close();

        System.out.println("\nArray:");
        for (String a : arr) {
            System.out.println(a);
        }

        System.out.println("\nCheck validity:");
        for(String a: arr) {
            try {
                Pattern.compile(a);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            } 
        }
    }
}
