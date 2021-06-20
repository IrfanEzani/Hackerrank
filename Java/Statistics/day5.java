package Statistics;

/**
 * day5: poisson distribution
 */
public class day5 {
    public static void main(String[] args) {
        /*
         * lambda = average number of sucess k = actual number of success
         */
        double e = Math.E, lambda = 2.5, result = 0, k = 5;
        result = (Math.pow(lambda, k) * Math.pow(e, -lambda)) / factorial((int) k);

        System.out.println("result: " + result);
    }

    static Long factorial(int n) {
        if (n < 0) {
            return null;
        }

        long result = 1;
        while (n > 0) {
            result *= n--;
        }
        return result;
    }
}