package ProblemSolving;
import java.util.Scanner;

public class viralAdvertising {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        int liked = 0, shared = 5, sum = 0; 

        for (int i = 1; i <= n; i++) {
            liked = (int) Math.floor(shared/2.0);
            sum += liked;
            System.out.println("Day: " + i + " Shared: " + shared + " Liked: " + liked + " Cumulative: " + sum);
            shared = liked * 3;
        }

        System.out.println(sum);

    }
}
