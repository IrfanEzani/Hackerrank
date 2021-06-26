package ProblemSolving;
import java.util.*;

public class funnyString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        
        for (int i = 0; i < len; i++) {
            String str = s.next();
            funnyCheck(str);
        }
        s.close();
    }

    static void funnyCheck(String str) {
        int[] firstStr = convertASCII(str);

        System.out.println("ASCII Value array:");
        for (int i : firstStr) {
            System.out.print(i + ", ");
        }

        String reversed = reverseString(str);
        int[] reversedStr = convertASCII(reversed);

        System.out.println("\nReversed ASCII Value array:");
        for (int i : reversedStr) {
            System.out.print(i + ", ");
        }

        int[] orgDiff = checkDifference(firstStr);
        int[] rvrDiff = checkDifference(reversedStr);
        boolean flag = true;
        for (int i = 0; i < rvrDiff.length; i++) {
            if(orgDiff[i] != rvrDiff[i]) {
                flag = false;
            }
        }

        if(flag) {System.out.println("FUNNY");}
        else {System.out.println("NOT FUNNY");}
    }

    static String reverseString(String input) {
        char[] arr = input.toCharArray();
        String res = "";
        for (int i = arr.length-1; i >= 0; i--) {
            res += arr[i];
        }        
        return res;
    }

    static int[] convertASCII(String input) {
        int[] tempArr = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            int ascii = (int) input.charAt(i);
            tempArr[i] = ascii;
        }
        return tempArr;
    }

    static int[] checkDifference(int[] arr) {
        int[] result = new int[arr.length-1];
        System.out.println("\nDifference in Array:");
        for (int i = 1; i < arr.length; i++) {
            int difference = Math.abs(arr[i] - arr[i-1]);
            System.out.print(difference + ", ");
            result[i-1] = difference;
        }

        return result;
    }
}
