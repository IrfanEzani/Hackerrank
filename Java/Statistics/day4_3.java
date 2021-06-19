package Statistics;

public class day4_3 {
    public static void main(String[] args) {
        /* geometric distribution formula = q^(n-1) x p  */
        double p = 1.0/3.0, q = 1-p, result = 0;
        int n = 5;
        result = Math.pow(q, n-1) * p;
        System.out.printf("%.3f", result);
    }
}
