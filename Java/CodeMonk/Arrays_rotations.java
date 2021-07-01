package CodeMonk;

import java.io.*;
import java.util.*;

public class Arrays_rotations {
    public static void main(String[] args) throws NumberFormatException, IOException {

        Scanner s = new Scanner(System.in);

        int c = s.nextInt();
        for (int i = 0; i < c; i++) {
            int n = s.nextInt();
            int k = s.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }
            int[] result = rotateArr(arr, k, n);
            print(result);
        }
        s.close();

    }

    static int[] rotateArr(int[] arr, int k, int n) {
        int[] rotated = new int[n];
        int i = 0, rotatedIndex = 0;
        if (k > arr.length) {
            k = k % arr.length;
        }
        while (rotatedIndex < (arr.length - k)) {
            rotated[i + k] = arr[rotatedIndex];
            i++;
            rotatedIndex++;
        }

        rotatedIndex = 0;
        while (rotatedIndex < k) {
            rotated[rotatedIndex] = arr[i];
            rotatedIndex++;
            i++;
        }

        return rotated;
    }

    static void print(int a[]) {
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }

}

/*
 * PERFECT NO TLE ERROR Scanner scanner = new Scanner(System.in); int
 * numTestcases = scanner.nextInt(); for (int i = 0; i < numTestcases; i++) {
 * int arLength = scanner.nextInt(); int numRotations = scanner.nextInt();
 * numRotations = numRotations % arLength; scanner.nextLine();
 * 
 * String inputString = scanner.nextLine(); String[] inputStringArray =
 * inputString.split(" ");
 * 
 * StringBuffer sb = new StringBuffer(); for (int j = 0; j < arLength; j++) {
 * sb.append( inputStringArray[ (arLength + j - numRotations) % arLength ] + " "
 * ); } System.out.print(sb); System.out.println(""); } scanner.close();
 */