package Statistics;

/* Normal distribution */
public class day5_5 {
    public static void main(String[] args) {
        double mean = 70;
        double sdev = 10;

        //grade above 80    
        System.out.printf("%.2f", (1-normal(80, mean, sdev))*100);
        System.out.println();
        //grade above 60
        System.out.printf("%.2f", (1-normal(60, mean, sdev))*100);
        System.out.println();
        //grade below 60
        System.out.printf("%.2f", (normal(60, mean, sdev))*100);
        System.out.println();

    }

    private static double normal(double x, double mean, double sdev) {
        return .5 * (1 + erf((x - mean) / (sdev * Math.sqrt(2))));
    }

    public static double erf(double z) {
        double t = 1.0 / (1.0 + 0.5 * Math.abs(z));

        // use Horner's method
        double ans = 1 - t * Math.exp(-z * z - 1.26551223
                + t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807
                        + t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * (0.17087277))))))))));
        if (z >= 0)
            return ans;
        else
            return -ans;
    }
}

/*  Expected output
15.87
84.13
15.87 */