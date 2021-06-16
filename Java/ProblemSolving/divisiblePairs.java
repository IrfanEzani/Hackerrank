package ProblemSolving;
import java.util.*;
class Test9 {
    public static int divisibleSumPairs(int n, int divisor, int[] arr) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    if((arr[i] + arr[j]) % divisor == 0 && (i <j)) {
                    counter++;                    
                } 
            }
        }
    return counter;
    }
}
public class divisiblePairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int divisor = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(Test9.divisibleSumPairs(n, divisor, arr)); 
        s.close(); 
    }
}

/* (4, 4), (4, 5), (4, 6), (5, 4), (5, 5), (5, 6), (6, 4), (6, 5), (6, 6), */