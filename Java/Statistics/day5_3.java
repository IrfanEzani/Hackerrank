package Statistics;

public class day5_3 {
    public static void main(String[] args) {
        
        double mean = 20;
        double sdev = 2;

        System.out.printf("%.3f\n", normal(19.5, mean, sdev));
        System.out.printf("%.3f\n", normal(22, mean, sdev) - normal(20, mean, sdev));

    }
    
    private static double normal(double x, double mean, double sdev) {
        return .5*(1 + ((x - mean) / sdev * Math.sqrt(2)));
    }
}
