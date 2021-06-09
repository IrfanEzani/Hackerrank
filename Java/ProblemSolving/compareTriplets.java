package ProblemSolving;

import java.io.*;
import java.util.*;


class Result2 {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER. The function accepts
     * INTEGER_ARRAY ar as parameter.
     */

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
       //set points
       int alice = 0;
       int bob = 0;

       for(int i = 0; i < 3; i++) {
           if (a.get(i) > b.get(i)) {
               alice++;
           } else if (a.get(i) < b.get(i)) {
               bob++;
           } 
       }

       /* System.out.println("alice's score: " + alice);
       System.out.println("bob's score: " + bob); */

       List<Integer> testFinal = new ArrayList<Integer>();
       testFinal.add(alice);
       testFinal.add(bob);
    
    return testFinal;
    }

}

public class compareTriplets {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        //create list
        List<Integer> arr1 = new ArrayList<Integer>();
        List<Integer> arr2 = new ArrayList<Integer>();
        /* System.out.println("alice's:"); */
        for(int i = 0; i < 3; i++) {
            arr1.add(s.nextInt());
        }

        /* System.out.println("bob's:"); */
        for (int i = 0; i < 3; i++) {
            arr2.add(s.nextInt());
        }
        s.close();
        
        List<Integer> finalArr = Result2.compareTriplets(arr1, arr2);
        for(int a: finalArr) { System.out.print(a + " ");}        
    }
}
