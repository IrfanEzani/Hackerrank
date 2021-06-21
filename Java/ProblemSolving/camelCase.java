package ProblemSolving;
import java.util.*;
public class camelCase {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String str = s.next();
            String[] strArr = str.split("[A-Z]", 0);
            for (String string : strArr) {
                System.out.println(string);
            }

            System.out.println("total:" + strArr.length);
            s.close();

    }
}
