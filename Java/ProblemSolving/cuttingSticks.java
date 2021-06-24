package ProblemSolving;
import java.util.*;

public class cuttingSticks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                System.out.println(arr.length - i);
            }
        }
    }
}
