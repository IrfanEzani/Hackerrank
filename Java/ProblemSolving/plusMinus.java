package ProblemSolving;

import java.io.*;
import java.util.*;

class Result4 {


    public static void plusMinus(List<Integer> arr) {
        double positive = 0.0;
        double negative = 0.0;
        double zero = 0.0;

        for(int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                ++positive;
            } else if (arr.get(i) < 0) {
                ++negative;
            } else {
                ++zero;
            }
        }

       /*  System.out.println("+ve total:" + positive);
        System.out.println("-ve total:" + negative);
        System.out.println("+-ve total:" + zero); */

        double positivePercentage =  positive/arr.size();
        double negativePercentage = negative/arr.size();
        double zeroPercentage = zero/arr.size();

        System.out.println(String.format("%.6f", positivePercentage));
        System.out.println(String.format("%.6f", negativePercentage));
        System.out.println(String.format("%.6f", zeroPercentage));
    }
}

public class plusMinus {
    public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    int size = s.nextInt();
    s.nextLine();

    List<Integer> arr = new ArrayList<Integer>();
    for (int i = 0; i < size; i++) {
        arr.add(s.nextInt());
    }
    s.close();
    Result4.plusMinus(arr);

    }
}
