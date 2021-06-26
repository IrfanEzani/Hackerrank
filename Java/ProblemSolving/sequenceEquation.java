package ProblemSolving;
import java.util.*;

public class sequenceEquation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] arr = new int[len+1];
        for (int i = 1; i <= len; i++) {
            int x = s.nextInt();
            arr[x] = i;
        }
        s.close();

        /* System.out.println("arr");
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }   */     

        for (int x = 1; x <= len; x++) {
            int y = arr[arr[x]];
            System.out.println(y);
        }
    }
}
