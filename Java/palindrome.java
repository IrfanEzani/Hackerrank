/* import java.io.*;
 */import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        char[] arr = A.toCharArray();

        String reversed = "";
        for(int i = arr.length-1; i >= 0; i--) {
            reversed += arr[i];
        }
        System.out.println(reversed);
        System.out.println("=========");
        System.out.println(A);

        char[] arr2 = reversed.toCharArray();
        Boolean flag = false;
        for(int i =0; i < arr.length; i++) {
            if(arr[i] == arr2[i] && arr[0] == arr2[0]) {
                flag = true;
            } 
        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    } 
}
