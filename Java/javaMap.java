import java.util.*;

public class javaMap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        s.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            String name = s.nextLine();
            int phone = s.nextInt();
            s.nextLine();
            // name as key, phone as value
            map.put(name, phone);
        }

        while(s.hasNext()) {
            String question = s.nextLine();
            //check if map contains the same question key
            if(map.containsKey(question)) {
                System.out.println(question + "=" + map.get(question));
            } else {
                System.out.println("Not found");
            }
        }
        s.close();
    }
}
