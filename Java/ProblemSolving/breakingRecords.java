package ProblemSolving;

import java.util.*;

class Test {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int lowest = scores.get(0), highest = scores.get(0), breaklow = 0, breakhigh = 0;
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > highest) {
                highest = scores.get(i);
                breakhigh++;
            }
            if (scores.get(i) < lowest) {
                lowest = scores.get(i);
                breaklow++;
            }
        }

        List<Integer> total=new ArrayList<Integer>();
        total.add(breakhigh);
        total.add(breaklow);
    
        return total;
    }
}

public class breakingRecords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            arr.add(s.nextInt());
        }
        List<Integer> result = Test.breakingRecords(arr);
        for (Integer i : result) {
            System.out.print(i + " ");
        }
        s.close();
    }
}
