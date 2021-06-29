package CodeMonk;

import java.util.*;

public class Arrays_rotations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        for (int i = 0; i < c; i++) {
            int n = s.nextInt();
            int k = s.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }
            /* int[] result = rotateArr(arr, k, n); */
            int[] result = rotate(arr, k);
            print(result);
        }
        s.close();
    }

    static int[] rotateArr(int[] arr, int k, int n) {
        int[] rotated = new int[n];

        int i = 0, rotatedIndex = 0;

        if(k > arr.length) {
            k = k% arr.length;
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

    static int[] rotate(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        return arr;
    }

    static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--; 
        }
    }
}
