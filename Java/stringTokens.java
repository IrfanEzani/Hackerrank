import java.util.*;

public class stringTokens {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String a = s.nextLine();
       s.close();

       //trim length (past test case)
        if (a.trim().length() == 0 || a.trim().length() > 400000) {
            System.out.println(0);
            return;
        }
       //split string using regex and place string in array
       String[] tokenArray = a.trim().split("[ ,.!?_'@]+");
       System.out.println(tokenArray.length);
       for (int i = 0; i < tokenArray.length; i++) {
        System.out.println(tokenArray[i]);
        }    
    }
}
