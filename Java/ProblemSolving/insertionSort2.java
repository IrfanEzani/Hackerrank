package ProblemSolving;

import java.util.*;

public class insertionSort2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // length
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        // notes
        /*
         * insertion sort 1. find key, key is the element where the elem before is
         * larger. arr[j] is the elem before. 2. make arr[j] to become the key,
         * {3,4,7,7,6,2,1} 3.update j value & arr[j+1] = key. 4. update arr[j+1] on
         * array {3,4,5,7,7,2,1} -> {3,4,5,6,7,2,1}
         * 
         * 
         * 
         */
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            // j receives the predecessor element
            /*
             * System.out.println("i:" + i + " j:" + j + " arr[j]: " + arr[j] + " key: " +
             * key);
             */
            while (j >= 0 && arr[j] > key) {
                
                /* System.out.println("in while loop:"); */
                /* System.out.println("arr[j+1]: " + arr[j+1] + " = arr[j]: " + arr[j]); */
                arr[j + 1] = arr[j];
                j = j - 1;
                /* System.out.println("j value: " + j); */
            }
            /* System.out.println("arr[j+1]: " + key); */
            arr[j + 1] = key;
            print(arr);
        }
        /* System.out.println("out:"); */
        /* print(arr); */
    }

    static void print(int a[]) {
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
}
