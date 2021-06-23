package ProblemSolving;
import java.util.*;

/**
 * marsExploration
 */
public class marsExploration {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        s.close();
        int len = str.length(), size = 3, count = 0;
        List<String> arr = new ArrayList<>();

        for (int i = 0; i < len; i+=size) {
            arr.add(str.substring(i, Math.min(len, i+size)));
        }

        /* for (String string : arr) {
            System.out.print(string + ", ");
        }
        System.out.println("size:" + arr.size()); */

        for (int i = 0; i < arr.size(); i++) {
            if(!arr.get(i).matches("SOS")) {
                char[] charArr = arr.get(i).toCharArray();
               if(charArr[0] != 'S') {count++;}
               if(charArr[1] != 'O') {count++;}
               if(charArr[2] != 'S') {count++;}
            }
        }

        System.out.println(count);
    
    }
}