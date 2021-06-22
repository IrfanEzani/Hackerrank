package ProblemSolving;
import java.util.Scanner;


public class catsAndMouse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();

        for (int i = 0; i < len; i++) {
            int x = s.nextInt(), y = s.nextInt(), z = s.nextInt();
            int differenceA = Math.abs(z-x), differenceB = Math.abs(z-y);  
            if(differenceA < differenceB) {
                System.out.println("Cat A");
            } else if (differenceA == differenceB) {
                System.out.println("Mouse C");
            } else {
                System.out.println("Cat B");
            }
        }
        s.close();
    }
}
