package Statistics;

public class day4_4 {
    public static void main(String[] args) {
        /* geometric distribution formula = q^(n-1) x p  */
        //calculate ayleast 1 defect is found during the first 5 inspections
        double p = 1.0/3.0,result = 0;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            result += geometric(i, p);
        }
        System.out.printf("%.3f", result);
    }

    private static double geometric (int n, double p) {
        return Math.pow(1 - p, n - 1) * p;
    }
}
