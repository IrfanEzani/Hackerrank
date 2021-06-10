package ProblemSolving;
import java.util.*;


class Result5 {
    public static void miniMaxSum(List<Integer> arr) {
        System.out.println("unsorted:");
        for (Integer integer : arr) {
            System.out.print(integer + ", ");
        }

        Collections.sort(arr);
        System.out.println("\nsorted:");
        for (Integer integer : arr) {
            System.out.print(integer + ", ");
        }
        
        long mini = 0;
        long max = 0;

        for (int i = 0; i < arr.size() -1; i++) {
            mini += arr.get(i);
        }

        for (int i = 1; i < arr.size(); i++) {
            max += arr.get(i);
        }

        System.out.println("\nMinimum sum value:" + mini);
        System.out.println("Maximum sum value:"  + max);
        System.out.println(mini + " " + max);
    }
}
public class miniMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            arr.add(s.nextInt());
        }
        s.close();
        Result5.miniMaxSum(arr);

        
    }
    
    
}
