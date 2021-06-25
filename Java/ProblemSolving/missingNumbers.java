package ProblemSolving;

import java.util.*;

public class missingNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr_len = s.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < arr_len; i++) {
            arr.add(s.nextInt());
        }
        int original_len = s.nextInt();
        List<Integer> original = new ArrayList<Integer>();
        Set<Integer> store = new HashSet<>();
        for (int i = 0; i < original_len; i++) {
            original.add(s.nextInt());
        }
        s.close();
        /* int[] test = new int[10];
        for (int i = 0; i < test.length; i++) {
            
        } */

        Collections.sort(arr);
        Collections.sort(original);

        /* System.out.println("before:");
        for (int i : original) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i + ", ");
        } */
        for (int i = 0; i < original_len; i++) {
            if (!original.get(i).equals(arr.get(i))) {
               /*  System.out.println("\nindex:" + i);
                System.out.println("elem in original:" + original.get(i));
                System.out.println("elem in arr:" + arr.get(i)); */
                arr.add(i, original.get(i)); 
                store.add(original.get(i));
/* 
                System.out.println("updated:");
                for (int j : original) {
                    System.out.print(j + ", ");
                }
                System.out.println();
                for (int j : arr) {
                    System.out.print(j + ", ");
                } */
            }
        }

        /* System.out.println("\n\nafter:");
        for (int i : original) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i + ", ");
        } */
        List<Integer> list = new ArrayList<Integer>(store);
        Collections.sort(list);
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
