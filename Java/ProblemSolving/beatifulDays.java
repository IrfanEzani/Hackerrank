package ProblemSolving;

import java.util.*;

public class beatifulDays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt(), end = s.nextInt(), divisor = s.nextInt();
        s.close();
        
        int size = end - start + 1;
        List<Integer> arr = new ArrayList<Integer>(size);

        for (int i = start; i <= end; i++) {
            arr.add(i);
        }
        beautify(arr, divisor);
    }

    static void beautify(List<Integer> arr, int divisor) {
        int counter = 0;
        float d = divisor;
        for (int i = 0; i < arr.size(); i++) {
            int reversedNumber = reverse(arr.get(i));
            if((Math.abs(arr.get(i) - reversedNumber)/d % 1 == 0)) {
                double ans = Math.abs(arr.get(i) - reversedNumber) / d;
                System.out.println(ans);
                counter++;
            }
        }
        System.out.println(counter);
        
    }

    static int reverse(int n) {
        int reversed = 0;

        // run loop until num becomes 0
        while (n != 0) {
            // get last digit from num
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            // remove the last digit from num
            n /= 10;
        }
        return reversed;
    }
}
