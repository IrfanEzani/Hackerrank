import java.util.Scanner;

public class StringtoInt {
    static Scanner s = new Scanner(System.in);
    static String a = s.nextLine();
    static boolean flag = false;

    static {
        try {
            int n = Integer.parseInt(a);
            if (n == (int)n) {
                System.out.println("Good job");
            }
        } catch (NumberFormatException e) {
            System.out.println("Wrong answer");
        }
    }
    /* static block always gets executed first in Java because it is stored in the memory at the time of class loading and before the object creation. */
    public static void main(String[] args){
    }
}
