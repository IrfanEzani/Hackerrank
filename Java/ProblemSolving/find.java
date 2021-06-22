package ProblemSolving;
import java.util.*;

//find elem in array

public class find {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        s.close();
        check(arr, k);
    }

    private static void check(int[] arr, int toCheckValue)
    {
        
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }
 
        // Print the result
        System.out.println(test);
    }
 
}
