import java.util.Scanner;

class calculatorException extends Exception {
    public calculatorException(String message) {
        super(message);
    }
}

class MyCalculator {
    public long power(int a, int b) throws Exception {
        if (a == 0 && b == 0) {
            throw new Exception("n and p should not be zero.");
        } else if (a < 0 || b < 0) {
            throw new Exception("n or p should not be negative.");
        } else {
            return ((long) Math.pow(a, b));
        }

    }
}

public class exceptionHandling {

    public static final Scanner in = new Scanner(System.in);
    public static final MyCalculator my_calculator = new MyCalculator();

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}