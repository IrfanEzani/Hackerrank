package Statistics;

import java.util.*;

/**
 * day4
 */
public class day4 {
    public static void main(String[] args) {
        int n = 6;
        //turn ratio to probability
        double ratio = 1.09, p = ratio / (1 + ratio), result = 0;

        for (int x=  3; x <= n; x++) {
            result+=probability(n, x, p);
        }
        System.out.printf("%.3f", result);
    }

    static Double probability(int n, int x, double p) {
        if (p < 0 || p > 1 || n < 0 || x < 0 || x > n) {
            return null;
        }
        return permutation(n, x) * Math.pow(p,x) * Math.pow(1-p, n-x);
    }

    static Long permutation(int n, int x) {
        if (n < 0 || x < 0) {
            return null;
        }

        return factorial(n) / (factorial(x) * factorial(n-x));
    }

    //calculate factorial for permutation function
    static Long factorial(int n) {
        if (n < 0) {
            return null;
        }

        long result = 1;
        while(n > 0) {
            result *= n--;
        }
        return result;
    }
}