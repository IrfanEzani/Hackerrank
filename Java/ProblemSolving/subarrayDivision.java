package ProblemSolving;
import java.util.Scanner;

public class subarrayDivision {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }        
        int d = s.nextInt();
        int m = s.nextInt();
        s.close();
        int result = birthday(arr, d, m);
        System.out.println(result);
    }

    static int birthday(int[] s, int d, int m) {
        int length = s.length;
        int numWays = 0, sum = 0;
        for(int i = 0 ; i <= (length - m) ; i++){
            for(int j = 0 ; j < m ; j++){
                sum = sum + s[j+i];
            }
            if(sum == d){
                numWays++;
            }
            sum = 0;
        }
        return numWays;
    }
}
