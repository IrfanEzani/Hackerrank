package ProblemSolving;

import java.io.*;
import java.util.*;


class Result {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER. The function accepts
     * INTEGER_ARRAY ar as parameter.
     */

     static int simpleArraySum(List<Integer> ar) {
        int total = 0; 
        for (int i : ar) {
            total += i;
        }
        return total;
    }

}

public class sum {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("enter length");
        int n = s.nextInt();
        //create list
        List<Integer> numberArr = new ArrayList<Integer>();
        System.out.println("Enter number");
        for(int i = 0; i < n; i++) {
            numberArr.add(s.nextInt());
        }
        s.close();
       int total = Result.simpleArraySum(numberArr);
       System.out.println(total);
    }
}
