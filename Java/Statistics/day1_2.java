package Statistics;

import java.util.*;

//calculate interquartile range
public class day1_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // variable declarations
        int n = s.nextInt();
        int sum = 0;
        float q1med = 0, q3med = 0;
        int[] tempArr = new int[n], frequencies = new int[n];
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // data insertion
        for (int i = 0; i < n; i++) {
            tempArr[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            frequencies[i] = s.nextInt();
            sum += frequencies[i];

        }
        int[] finalArr = new int[sum];
        int len = finalArr.length;
        s.close();

        // add numbers accordingly to frequency
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < frequencies[i]; j++) {
                numbers.add(tempArr[i]);
            }
        }

        // sort list, insert in finalArr
        Collections.sort(numbers);
        for (int i = 0; i < finalArr.length; i++) {
            finalArr[i] = numbers.get(i);
        }

        
          System.out.println("final arr:"); for (int i : finalArr) { System.out.print(i
          + " "); }
        

        // get first quarter's median
        q1med = median(finalArr, 0, len / 2 - 1);

        // check for third quarter
        // if even
        if (n % 2 == 0) {
            q3med = median(finalArr, len / 2, len - 1);
        } else {
            q3med = median(finalArr, len / 2 + 1, len - 1);
        }

        // check difference
        double answer = q3med - q1med;
        /*
         * System.out.println("\n1st quartile median:" + q1med);
         * System.out.println("3rd quartile median:" + q3med);
         */
        System.out.println("interquatile range is:" + answer);
    }

    private static int median(int[] arr, int start, int end) {
        int length = end - start + 1;
        int median = 0;
        // if even
        if (length % 2 == 0) {
            median = (arr[start + length / 2 - 1] + arr[start + length / 2]) / 2;
            // if odd
        } else {
            median = arr[start + length / 2];
        }
        return median;
    }
}
