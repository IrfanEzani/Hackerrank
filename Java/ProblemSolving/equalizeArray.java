package ProblemSolving;

import java.util.*;

public class equalizeArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        minDeletion(arr);
    }

    static void minDeletion(int[] arr) {
        int max = 1;
        // declare hashmap
        // hashmap makes absolutely no guarantees about the iteration order
        Map<Integer, Integer> nums = new HashMap<>();
        for (int i : arr) {
            // insert array elements as keys into the map if nums doesnt contain the key of
            // element i, with value as 1.
            if (!nums.containsKey(i)) {
                nums.put(i, 1);
            } else {
                //insert key and values. value = get value of specific key and add 1
                nums.put(i, nums.get(i) + 1);
                if(max < nums.get(i)) {
                    System.out.println("\nMax smaller than current nums");
                    System.out.println("nums.get(i)= " +  nums.get(i));
                    max = nums.get(i);
                    System.out.println("max val:" + max);
                }
            }
            System.out.println("\ncheck keys in hashmap:");
            for (int k : nums.keySet()) {
                System.out.print(k + ", ");
            }
            System.out.println("\ncheck values in hashmap:");
            for (int k : nums.values()) {
                System.out.print(k + ", ");
            }
            System.out.println("\nnew round");
        }
        System.out.println("final answer: " + (arr.length-max));
    }
}
