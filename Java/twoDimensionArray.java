import java.util.Scanner;


public class twoDimensionArray {
    public static void main(String[] args) {
        int x = 6, y = 6;
        int[][] sixBySix = new int[x][y];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sixBySix[i][j] = s.nextInt();
            }
        }
        s.close();
       /*  System.out.println("printing test array:");
        System.out.print(sixBySix[0][0] + " ");
        System.out.print(sixBySix[0][1] + " ");
        System.out.print(sixBySix[0][2] + " ");
        System.out.println();
        System.out.print(sixBySix[1][0] + " ");
        System.out.print(sixBySix[1][1] + " ");
        System.out.print(sixBySix[1][2] + " ");
        System.out.println();
        System.out.print(sixBySix[2][0] + " ");
        System.out.print(sixBySix[2][1] + " ");
        System.out.print(sixBySix[2][2] + " "); */
        
        int maxSum = -54;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i>1 && j>1) {
                    System.out.println("i val: " + i + " j val: " + j);
                    System.out.print(sixBySix[i-2][j-2] + " ");
                    System.out.print(sixBySix[i-2][j-1] + " ");
                    System.out.print(sixBySix[i-2][j] + " ");
                    System.out.println();
                    System.out.print(sixBySix[i-1][j-2] + " ");
                    System.out.print(sixBySix[i-1][j-1] + " ");
                    System.out.print(sixBySix[i-1][j] + " ");
                    System.out.println();
                    System.out.print(sixBySix[i][j-2] + " ");
                    System.out.print(sixBySix[i][j-1] + " ");
                    System.out.print(sixBySix[i][j] + " ");
                    System.out.println();
                    int sum = sixBySix[i-2][j-2] + sixBySix[i-2][j-1] + sixBySix[i-2][j] + sixBySix[i-1][j-1] + sixBySix[i][j-2] +sixBySix[i][j-1] + sixBySix[i][j];
                    System.out.println("hourglass sum value: " + sum);
                    if(sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
            System.out.println("===============");
        }
        System.out.println("MAXIMUM SUM: " + maxSum);
    }
}

/*
 * 1 1 1 0 0 0 0 1 0 0 0 0 1 1 1 0 0 0 0 0 2 4 4 0 0 0 0 2 0 0 0 0 1 2 4 0
 */
