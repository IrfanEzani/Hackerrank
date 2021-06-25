package ProblemSolving;

import java.util.*;

public class twoStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        for (int i = 0; i < len; i++) {
            String s1 = s.next(), s2 = s.next();
            String result = findSubstring(s1, s2);
            System.out.println(result);
        }
        s.close();
    }

    static String findSubstring(String s1, String s2) {
        String full = "abcdefghijklmnopqrstuvwxyz";
        char[] arr = full.toCharArray();
        String flag = "NO";
        for (int i = 0; i < arr.length; i++) {
            if (s1.indexOf(arr[i]) > -1 && s2.indexOf(arr[i]) > -1) {
                /* System.out.println("FOUND S1 " + arr[i] + ", index at: " + s1.indexOf(arr[i])); */
                /* System.out.println("FOUND S2 " + arr[i] + ", index at: " + s2.indexOf(arr[i])); */
                flag = "YES";
            }
        }
        return flag;
    }
}
