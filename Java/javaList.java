import java.util.*;

public class javaList {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        for (int i = 0; i < length; i++) {
            arr.add(i, s.nextInt());
        }
        
        int queryTotal = s.nextInt();
        s.nextLine();
        for(int i = 0; i < queryTotal; i++) {
            String question = s.next();
            if(question.equals("Insert")) {
                arr.add(s.nextInt(), s.nextInt());
            } else if (question.equals("Delete")) {
                arr.remove(s.nextInt());
            } 
        }
        s.close();
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}
