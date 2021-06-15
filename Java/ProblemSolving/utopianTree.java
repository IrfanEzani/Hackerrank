package ProblemSolving;
import java.util.*;

class Test8 {
    public static int utopianTree(int n) {
    
    return 0;
    }
}
public class utopianTree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("total case:" + n);
        for(int i = 0; i < n; i++) {
            int temp = s.nextInt();
            System.out.println("next int val:" + temp);
            Test8.utopianTree(temp);
        }
        s.close();
    }
}
