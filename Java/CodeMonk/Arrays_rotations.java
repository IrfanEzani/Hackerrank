package CodeMonk;

import java.io.*;

public class Arrays_rotations {
    public static void main(String[] args) throws NumberFormatException, IOException {
        /*
         * Scanner s = new Scanner(System.in);
         * 
         * int c = s.nextInt(); for (int i = 0; i < c; i++) { int n = s.nextInt(); int k
         * = s.nextInt(); int[] arr = new int[n]; for (int j = 0; j < n; j++) { arr[j] =
         * s.nextInt(); } int[] result = rotateArr(arr, k, n); /* int[] result =
         * rotate(arr, k); print(result); } s.close();
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println("c val:" + c);
        while ( c > 0) {
            String[] temp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            int n = Integer.parseInt(temp[0]);
        System.out.println("n val:" + n);
            int k = Integer.parseInt(temp[1]);
        System.out.println("k val:" + k);
            int[] arr = new int[n];
            String[] sTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            for (int j = 0; j < n; j++) {
                System.out.println("j val:" + j);
                arr[j] = Integer.parseInt(sTemp[j]);
            }
            int[] result = rotateArr(arr, k, n);
            print(result);
            c--;
        }

        bufferedReader.close();

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

    /*
     * static int[] rotate(int[] arr, int k) { k = k % arr.length; reverse(arr, 0,
     * arr.length-1); reverse(arr, 0, k-1); reverse(arr, k, arr.length-1); return
     * arr; }
     * 
     * static void reverse(int[] arr, int start, int end) { while(start < end) { int
     * temp = arr[start]; arr[start] = arr[end]; arr[end] = temp; start++; end--; }
     * }
     */
}
