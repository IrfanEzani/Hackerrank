package ProblemSolving;
import java.util.*;

class Test7 {
    public static String angryProfessor(int threshold, List<Integer> stdArrivals) {
        //System.out.println("Threshold value: " + threshold);
        //System.out.println("Arrivals: " + stdArrivals);
        int ontime = 0;
        for (int i = 0; i < stdArrivals.size(); i++) {
            if(stdArrivals.get(i) <= 0) {
                ontime++;
            }
        }
        //System.out.println("Students on time:" + ontime);
        if (threshold > ontime) {
            return "YES";
        }
    return "NO";
    }
}
public class angryProfessor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int i = 0; i < n; i++) {
            int studentTotal = s.nextInt();
            int threshold = s.nextInt();
            List<Integer> stdArrivals = new ArrayList<Integer>();
            for(int j = 0; j < studentTotal; j++) {
                stdArrivals.add(s.nextInt());
            }
            String result = Test7.angryProfessor(threshold, stdArrivals);
            System.out.println(result);
        }
        s.close();
    }
}
