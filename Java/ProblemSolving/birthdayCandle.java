package ProblemSolving;
import java.util.*;


public class birthdayCandle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int tallest = 0;
        int frequency = 0;
        for (int i = 0; i < n; i++) {
            int height = s.nextInt();
            if (height > tallest) {
                tallest = height;
                frequency = 1;
            } else if (height == tallest) {
                frequency++;
            }
        }
        s.close();
        System.out.println(frequency);
    }
}