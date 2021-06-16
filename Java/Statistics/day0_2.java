package Statistics;
import java.util.*;
//weighted_mean
public class day0_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int[] xArr = new int[length], wArr = new int[length];
        float weightedSum = 0, wSum = 0;
        for (int i = 0; i < length; i++) {
            xArr[i] = s.nextInt();
        } 
        for (int i = 0; i < length; i++) {
            wArr[i] = s.nextInt();
            weightedSum += (xArr[i] * wArr[i]);
            wSum += wArr[i];
        }
        s.close();
        System.out.printf("%.1f", (weightedSum/wSum));
    }
}
