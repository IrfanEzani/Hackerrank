import java.util.*;

public class substringComparison {
    public static String getSmallestAndLargest(String string, int length) {
        String smallest = "";
        String largest = "";
        
        List<String> subStrings = new ArrayList<String>();
        System.out.println("Original Loop:");
        for (int i = 0; i < string.length(); ++i) {
            for (int k = i+1; k <= string.length(); ++k) {
                if(string.substring(i, k).length() == length) {
                    System.out.println("substr:" + string.substring(i, k));
                    subStrings.add(string.substring(i, k));
                }
            }
        }
        //sort lexicographically using swap method
        for (int i = 0; i < subStrings.size()-1; i++) {
            for (int j = i+1; j < subStrings.size(); j++) {
                if(subStrings.get(i).compareTo(subStrings.get(j)) > 0) {
                    Collections.swap(subStrings, i, j);
                }
            }
        }

       /*  System.out.println("\nSorted list:");
        for(String i : subStrings) {
            System.out.print(i + "-");
        }
 */
        smallest = subStrings.get(0);
        largest = subStrings.get(subStrings.size()-1);
        
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int l = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, l));
    }
}
