package ProblemSolving;
import java.util.*;

public class hackerrankString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        for (int i = 0; i < len; i++) {
            String str = s.next();
            String result = checkIfIsHacker(str);
            System.out.println(result);
        }
        s.close();
    }

    private static String checkIfIsHacker(String s) {

        String str = "hackerrank";
        if (s.length() < str.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                    j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");

    }
}
