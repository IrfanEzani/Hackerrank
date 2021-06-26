package ProblemSolving;

import java.util.Scanner;

public class binaryStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String binaryStr = in.next();
        int step = 0;
        for (int i = 0; i <= n - 3;) {
            if (binaryStr.substring(i, i + 3).equals("010")) {
                System.out.println("i val: " + i + " i+3 val: " + (i+3));
                step++;
                System.out.println("step value: " + step);
                i = i + 3;
            } else {
                System.out.println("outside if");
                i++;
            }
        }
        System.out.println(step);
        in.close();
    }
}
