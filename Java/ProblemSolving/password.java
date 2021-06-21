package ProblemSolving;

import java.util.*;

/**
 * password
 */
public class password {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.nextLine();
        String password = s.nextLine();
        s.close();

        int count = 0;

        // if password dont match any lowercase
        if (!password.matches(".*[a-z].*")) {
            count++;
        }
        // find for uppercase
        if (!password.matches(".*[A-Z].*")) {
            count++;
        }
        // find for number
        if (!password.matches(".*[0-9].*")) {
            count++;
        }
        // find for special characters
        if (!password.matches(".*[!@#$%^&*()-+].*")) {
            count++;
        }

        int lengthDifference = 6 - password.length();

        if (lengthDifference > 0 && count <= lengthDifference) {
            System.out.println(lengthDifference);
        }

        System.out.println(count);
    }
}
