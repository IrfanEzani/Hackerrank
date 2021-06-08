/* import java.io.*;
 */import java.util.*;

public class stringsIntro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();

        //print total length
        System.out.println(A.length() + B.length());
        
        //compare lexicographically
        if(A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        //capitalize letter
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));


    }
}
