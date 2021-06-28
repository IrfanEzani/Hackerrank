import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d;
        ArrayList[] set = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            d = s.nextInt();
            set[i] = new ArrayList();
            for (int j = 0; j < d; j++) {
                set[i].add(s.nextInt());
            }
        }
        /* System.out.println("set length =  "+set.length);
        System.out.println("set[0] size = "+set[0].size()); */
        int queries = s.nextInt();
        for (int i = 0; i < queries; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            try{
                System.out.println(set[x-1].get(y-1));
            } catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
