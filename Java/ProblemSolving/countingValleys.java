package ProblemSolving;
import java.util.*;
public class countingValleys {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        s.nextLine(); //cancel \n
        String str = s.nextLine();
        s.close();


        char[] arr = new char[len];
        arr = str.toCharArray();
        int up = 0, down = 0, valley = 0;

        for (int i = 0; i < len; i++) {
            if(arr[i] == 'U') {
                up++;
                if(Math.abs(up-down) == 0) {
                    valley++;
                }
                
            } else {
                down++;
            }

            
        }


        System.out.println("valleys: " + valley);
        System.out.println("downs: " + down + " ups: " + up);
        
    }
}
