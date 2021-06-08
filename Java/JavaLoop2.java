/* import java.io.*;
 */import java.util.*;

public class JavaLoop2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        for (int i = 0; i < x; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();
            for (int j = 0; j < n; j++) {
                a += b;
                System.out.print(a + " ");
                b *= 2;
            }
            System.out.println("");
        }
        s.close();        
    }
}