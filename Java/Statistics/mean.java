package Statistics;
import java.util.*;

public class mean {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
           arr.add(s.nextInt());
        }
        s.close();

        float mean = 0;
        float total = 0;
        for (int i = 0; i < length; i++) {
            total += arr.get(i);
            mean = total/length;
        }
        System.out.println("Mean:" + mean);

        Collections.sort(arr);
        int mid = arr.size()/2;
        double ans;
        if(arr.size()%2 == 0) {
            ans = (((double)arr.get(mid) + (double)arr.get(mid-1))/2);
        } else {
            ans = (arr.get(mid));
        }
        System.out.println("Median:" + ans);


    }
}

    
