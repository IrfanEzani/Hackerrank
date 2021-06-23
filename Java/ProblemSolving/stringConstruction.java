package ProblemSolving;

import java.util.*;

public class stringConstruction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            String s = in.next();
            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            System.out.println("arr:");
            for (char c : arr) {
                System.out.print(c + ", ");
            }
            System.out.println();
            int count = 1;
            for (int j = 1; j < arr.length; j++) {
                System.out.println("(" + arr[j-1] + ", " + arr[j] + ")");
                if(arr[j-1] != arr[j]) {
                    count++;
                }
            }
          /*   System.out.println(s.chars().distinct().count()); */

            System.out.println("count:" + count);
        }

        in.close();
    }

}
