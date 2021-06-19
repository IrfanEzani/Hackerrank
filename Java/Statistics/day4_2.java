package Statistics;

/**
 * more binomial distribution
 */
public class day4_2 {

    public static void main(String[] args) {
        int n = 10;
        //turn ratio to probability
        double p = 0.12, result = 0, result2 = 0;

        //calculate for atmost
        for (int x = 0; x <= 2; x++) {
            result+= probability(n, x, p);
            System.out.println("x val:" + x);
        }
        System.out.println("for no more than 2:");
        System.out.printf("%.3f", result);
        System.out.println();
        

        //calculate for atleast
        for (int x= 2; x <= n; x++) {
            result2+=probability(n, x, p);
            System.out.println("x val:" + x);
        }
        System.out.println("\nfor atleast 2:");
        System.out.printf("%.3f", result2);
    }

    //calculate prob
    static Double probability(int n, int x, double p) {
        if (p < 0 || p > 1 || n < 0 || x < 0 || x > n) {
            return null;
        }
        return permutation(n, x) * Math.pow(p,x) * Math.pow(1-p, n-x);
    }


    //calculate the permutation
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
