package Statistics;

import java.util.*;

public class day1 {
    public static void main(String[] args) {
        /* Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int mid = length / 2, ans = 0, q1ans = 0, q3ans = 0;

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        
        Arrays.sort(arr);
        int[] q1 = new int[mid], q3 = new int[mid];
        int qmid = q1.length/2;
        System.out.println("Full Array:");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println("\nQ1 & Q3 mid:" + qmid);
        System.out.println("Q1 Array:");
        for (int i = 0; i < mid; i++) {
            q1[i] = arr[i];
            q3[i] = arr[mid+1+i];
            System.out.print(q1[i] + ", ");
        }
        System.out.println("\nQ3 Array:");
        for (int i = 0; i < mid; i++) {
            System.out.print(q3[i] + ", ");
        }

        if (length % 2 == 0) {
            ans = ((arr[mid] + arr[mid - 1]) / 2);  
        } else {
            ans = (arr[mid]);
              
        }
        if(q1.length % 2 == 0) {
            q1ans = ((q1[qmid-1] + q1[qmid])/2);  
            q3ans = ((q3[qmid-1] + q3[qmid])/2);
        } else {
            q1ans = (q1[qmid-1]);   
            q3ans = (q3[qmid-1]); 
        }

        System.out.println("\nMedian:" + ans);
        System.out.println("Q1 Median:" + q1ans);
        System.out.println("Q3 Median:" + q3ans);
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("n value:" + n);
        System.out.println("Array:");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
        //get first quarter's median
        System.out.println(median(arr, 0, n / 2 - 1));
        //get median
        System.out.println(median(arr, 0, n - 1));
        //check for third quarter
        //if even
        if (n % 2 == 0) {
            System.out.println(median(arr, n / 2, n - 1));
        } else {
            System.out.println(median(arr, n / 2 + 1, n - 1));
        }
    
        sc.close();
    }

    private static int median(int[] arr, int start, int end) {
        int length = end - start + 1;
        int median = 0;
        //if even
        if (length % 2 == 0) {
            median = (arr[start + length / 2 - 1] + arr[start + length / 2]) / 2;
        //if odd
        } else {
            median = arr[start + length / 2];
        }
        return median;
    }
}
