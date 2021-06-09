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

     static long simpleArraySum(List<Long> ar) {
        long total = 0; 
        for (long i : ar) {
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
        List<Long> numberArr = new ArrayList<Long>();
        System.out.println("Enter number");
        for(int i = 0; i < n; i++) {
            numberArr.add(s.nextLong());
        }
        s.close();
       long total = Result.simpleArraySum(numberArr);
       System.out.println(total);
    }
}
