package ProblemSolving;

import java.util.Scanner;

/**
 * sortIntro
 */
public class sortIntro {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int index = s.nextInt();
        int len = s.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
    
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == index) {
                System.out.println(i);
                break;
            }
        }
    }
}