import java.math.BigInteger;
import java.util.*;

public class bigInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger a = new BigInteger(s.next());
        BigInteger b = new BigInteger(s.next());
        s.close();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
