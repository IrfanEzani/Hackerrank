package Statistics;
import java.util.*;
//calculate standard deviation
public class day1_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] arr = new int[len];
        float mean = 0, meanTotal = 0, stdTotal = 0;
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
            meanTotal += arr[i];
        }
        mean = meanTotal/len;
        for (int i = 0; i < len; i++) {
            stdTotal += Math.pow((arr[i] - mean), 2);
        }
        System.out.printf("%.1f",Math.sqrt(stdTotal/len));
        s.close();
    }
}