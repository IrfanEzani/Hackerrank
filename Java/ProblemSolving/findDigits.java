package ProblemSolving;
import java.util.*;

public class findDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n  = s.nextInt();
        for (int i = 0; i < n; i++) {
            int number = s.nextInt();
            findDivisor(number);
        }
        s.close();
    }
    static void findDivisor(int number) {
        int mainNumber = number, counter = 0;
        List<Integer> numberArr = new ArrayList<Integer>();
        while (number > 0) {
            numberArr.add((number % 10));
            number = number / 10;
        }
        Collections.sort(numberArr);
        for (int i = 0; i < numberArr.size(); i++) {
            if(numberArr.get(i) == 0) {
                continue;
            }
            if(mainNumber % numberArr.get(i) == 0) {
                counter++;
            } 
        }
        System.out.println(counter);
     }
}
