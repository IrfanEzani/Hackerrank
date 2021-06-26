package ProblemSolving;
import java.util.*;

public class icecreamParlor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        for (int i = 0; i < cases; i++) {
            int p = s.nextInt();
            int size = s.nextInt();
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = s.nextInt();
            }
            /* calculate(p, size, arr); */
            int[] result = icecreamParlorA2(p, arr);
            System.out.println("\nAnswer:");
            for (int r : result) {
                System.out.print(r + " ");
            }
        }
        s.close();
    }

    static void calculate(int price, int choiceSize, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] + arr[j] == price) {
                    System.out.println((j+1) + " " + (i+1));
                }
            }
        }
    }

    static int[] icecreamParlorA2(int m, int[] arr) {
		int result[] = new int[2];
		int n = arr.length;
		int frequency[] = new int[10];

		Arrays.fill(frequency, -1);
    
        
		for (int i = 0; i < n; i++) {
			int x = arr[i];
            System.out.println("\nm val:" + m);
            System.out.println("x val:" + x);
			int y = m - x;
            System.out.println("y val:" + y);

			if (y >= 0) {
                System.out.println("Y bigger than 0, value of Y: " + y);
				int j = frequency[y];
                System.out.println("j, " + j + " is from frequency[y]: " + frequency[y]);
                System.out.println("updated arr:");
                for (int f : frequency) {
                    System.out.print(f + ", ");
                }
				if (j != -1) {
					result[0] = j + 1;
					result[1] = i + 1;
					break;
				}
			}

            System.out.println("\nout of if statement");
			frequency[x] = i;
            System.out.println("at x value " + x + " frequency[x] updated to " + i);
            System.out.println("updated arr, outside loop:");
                for (int f : frequency) {
                    System.out.print(f + ", ");
                }
		}

		return result;

	}
}
