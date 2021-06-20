package Statistics;

public class day5_2 {
    public static void main(String[] args) {
        /*
         * lambda = average number of sucess k = actual number of success
         */
        double lambdaA = 0.88, lambdaB = 1.55, resultA = 0, resultB = 0;
        resultA = 160 + 40 * (lambdaA + Math.pow(lambdaA, 2));
        resultB = 128 + 40 * (lambdaB + Math.pow(lambdaB, 2));
        System.out.println(resultA);
        System.out.println(resultB);
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
