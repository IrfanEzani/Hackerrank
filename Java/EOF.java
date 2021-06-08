import java.util.*;

public class EOF {

    public static void main(String[] args) {
        /* Scanner s = new Scanner(System.in);
        int i = 1;
        while(s.hasNext()) {
            String a = s.nextLine();
            System.out.println(i + " " + a);
            i++;
        }
        s.close(); */
        Scanner sc=new Scanner(System.in);  
    int i = 0;
    while (sc.hasNextLine()) {
        System.out.printf("%d %s\n",++i,sc.nextLine());
    }
    sc.close();
    }
}
