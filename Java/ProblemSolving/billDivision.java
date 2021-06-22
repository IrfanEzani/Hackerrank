package ProblemSolving;
import java.util.Scanner;

public class billDivision {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int k = s.nextInt();
        int arr[] = new int[len];
        int sum = 0, difference = 0;
        
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();    
        }
        int charged = s.nextInt();
       
        //remove arr[k]
        arr[k] = 0;

        //add sum
        for (int i : arr) {
            sum+=i;
        }
        s.close();
    
        sum = sum/2;

        if(charged == sum) {
            System.out.println("Bon Appetit");
        } else {
            difference = charged - sum;
            System.out.println(difference);
        }
        
        
    }
}
