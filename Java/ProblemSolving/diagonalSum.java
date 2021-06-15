package ProblemSolving;
import java.util.*;

/**
 * diagonalSum
 */
public class diagonalSum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int rightDiagonal = 0;
        int leftDiagonal = 0;
        int[][] a = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                a[i][j] = s.nextInt(); 
                 if(i == j) {
                    rightDiagonal += a[i][j];    
                } if (i+j == length-1) {
                    leftDiagonal += a[i][j];                   
                } 
            }
        }
        System.out.println(Math.abs(rightDiagonal-leftDiagonal));
        s.close();
    }
}