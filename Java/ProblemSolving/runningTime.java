package ProblemSolving;
import java.util.Scanner;

public class runningTime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // length
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                count++;
            }
            arr[j + 1] = key;
            print(arr);
            System.out.println("Count:" + count);
        }
    
    }

    static void print(int a[]) {
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
}
