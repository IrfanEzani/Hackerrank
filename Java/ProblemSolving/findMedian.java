package ProblemSolving;
import java.util.*;

public class findMedian {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int len = s.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        Arrays.sort(arr);
        int middle = arr.length/2;
        int ans;
        if(arr.length%2 == 0) {
            ans = ((arr[middle] + arr[middle-1])/2);
        } else {
            ans = arr[middle];
        }

        System.out.println("median:" + ans);
    }
}
