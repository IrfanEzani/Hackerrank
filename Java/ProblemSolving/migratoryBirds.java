package ProblemSolving;
import java.util.*;

public class migratoryBirds {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] arr = new int[len], countArr = new int[6], finalArr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        int max = 0;
        for(int val : arr) {
            System.out.println("CURRENT val: " + val);
            System.out.println("countArr val, before: " + countArr[val]);
            countArr[val]++;
            System.out.println("countArr val, at val: " + val + " is: " + countArr[val] + "\n");
            max = Math.max(max, countArr[val]);
        }

        for (int i = 0; i < countArr.length; i++) {
            if(countArr[i] == max) {
                System.out.println("number with highest frequency: " + i);
                break;
            }
        }

    }
}
