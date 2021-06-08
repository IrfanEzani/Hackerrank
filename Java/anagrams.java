import java.util.*;

public class anagrams {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next().toLowerCase();
        String b = s.next().toLowerCase();
        s.close();

        char arr1[] = a.toCharArray();
        char arr2[] = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

       if (Arrays.equals(arr1, arr2)) System.out.println("Anagrams");
       else {
           System.out.println("Not Anagrams");
       }
    }
}
