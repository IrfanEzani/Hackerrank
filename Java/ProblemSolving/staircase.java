package ProblemSolving;

import java.io.*;
import java.util.*;


class Result3 {
     static void staircase(int length) {
         //right-alligned staircase
         //for amount of space
        int spaceLimiter = length-1;
        for (int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                if (j < spaceLimiter) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            //print new line after one line is done and update space value
            System.out.println();
            spaceLimiter-=1;
        }
    }

}

public class staircase {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("enter length");
        int n = s.nextInt();
        s.close();
        Result3.staircase(n);
        
    }
}
