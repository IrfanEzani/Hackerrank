package ProblemSolving;
import java.util.*;


class Test6 {
    public static int hurdleRace(int maxHeight, List<Integer> hurdles) {
        // Write your code here
        int potion = 0;
        Collections.sort(hurdles);
        if(hurdles.get(hurdles.size()-1) > maxHeight) {
            potion = (hurdles.get(hurdles.size()-1) - maxHeight);
        }

    return potion;
    }
}
public class hurdleRace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), maxHeight = s.nextInt();
        List<Integer> hurdles = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            hurdles.add(s.nextInt());
        }
        
        int result = Test6.hurdleRace(maxHeight, hurdles);
        System.out.println(result);
        s.close();
    }
}
