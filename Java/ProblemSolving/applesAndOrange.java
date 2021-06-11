package ProblemSolving;
import java.util.*;

public class applesAndOrange {
    public static void countApplesAndOranges(int start, int end, int appleTreePosition, int orangeTreePosition, List<Integer> apples, List<Integer> oranges) {
        // test info

        /* System.out.println("starting position is " + start);
        System.out.println("ending position is " + end);
        System.out.println("apple tree position is " + appleTreePosition);
        System.out.println("orange tree position is " + orangeTreePosition);
        for (Integer i : apples) {
            System.out.println("apples is located at " + i);
        }
        for (Integer i : oranges) {
            System.out.println("oranges is located at " + i);
        } */
        
        //set new position for apples and orange
        for (int i = 0; i < apples.size(); i++) {
            apples.set(apples.indexOf(apples.get(i)), (appleTreePosition + apples.get(i)));
        }

        for (int i = 0; i < oranges.size(); i++) {
            oranges.set(oranges.indexOf(oranges.get(i)), (orangeTreePosition + oranges.get(i)));
        }

        int appleInHouse = 0;
        int orangeInHouse = 0;

        for (int i = 0; i < apples.size(); i++) {
            if(apples.get(i) >= start && apples.get(i) <= end) {
                appleInHouse++;
            }
        }

        for(int i = 0; i<oranges.size(); i++) {
            if(oranges.get(i) >= start && oranges.get(i) <= end) {
                orangeInHouse++;
            }
        }

        System.out.println(appleInHouse);
        System.out.println(orangeInHouse);
    }    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int appleTreePosition = s.nextInt();
        int orangeTreePosition = s.nextInt();
        int appleTotal = s.nextInt();
        int orangeTotal = s.nextInt();
        List<Integer> apples = new ArrayList<Integer>();
        for (int i = 0; i < appleTotal; i++) {
            apples.add(s.nextInt());
        }
        List<Integer> oranges = new ArrayList<Integer>();
        for (int i = 0; i < orangeTotal; i++) {
            oranges.add(s.nextInt());
        }
        s.close();
        countApplesAndOranges(start, end, appleTreePosition, orangeTreePosition, apples, oranges);
    }
}
