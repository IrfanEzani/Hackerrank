import java.util.*;

public class subArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int counter = 0;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print("(" + arr[k] + ")");
                    sum += arr[k];
                }
                if(sum < 0) {
                    counter++;
                }
                System.out.println("Sum: " + sum);
                System.out.println("counter:" + counter);
            }
        }
        System.out.println("\nFinal counter=" + counter);
        s.close();
    }
}
