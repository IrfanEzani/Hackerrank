package ProblemSolving;

import java.util.Scanner;

public class designerPDF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for (int h_i = 0; h_i < n; h_i++)
        {
            h[h_i] = s.nextInt();
        }
        String word = s.next();
        s.close();

        int length = word.length(), max = 0;
        for (int i = 0; i < length; i++) {
            char tempChar = word.charAt(i);
            System.out.println("tempChar: " + tempChar);
            max = max < h[tempChar - 97] ? h[tempChar - 97] : max;
            System.out.println("Max Value:" + max);
        }
        System.out.println("answer:" + (max*length));
    }
}
