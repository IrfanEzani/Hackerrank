package ProblemSolving;
import java.util.*;

class Test8 {
    public static int utopianTree(int n) {
    int height = 1;
    for(int i = height; i <= n; i++) {
        if (i % 2 == 0) {
            height++;
            /* System.out.println("new height val:" + height); */
        } else if (i%2 != 0) {
            height*=2;
           /*  System.out.println("new height val:" + height); */
        }
    }
    if (n == 0) {
        height += 0;
        /* System.out.println("new height val:" + height); */
    }
    return height;
    }
}
public class utopianTree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        /* System.out.println("total case:" + n); */
        for(int i = 0; i < n; i++) {
            int temp = s.nextInt();
            /* System.out.println("temp value:" + temp); */
            System.out.println(Test8.utopianTree(temp)); 
        }
        s.close();
    }
}
