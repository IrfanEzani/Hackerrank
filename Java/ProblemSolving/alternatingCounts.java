package ProblemSolving;
import java.util.*;

public class alternatingCounts {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        for (int i = 0; i < len; i++) {
            String str = s.next();
            System.out.println(alternates(str));
        }
        s.close();
    }

    static int alternates(String s) {
    int count = 0;
    char[] arr = s.toCharArray();

    for (int i = 1; i <  arr.length; i++) {
        if(arr[i] == arr[i-1]) {
            count++;
        }
    }
     return count;   
    }
}
