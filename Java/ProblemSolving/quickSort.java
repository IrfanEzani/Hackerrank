package ProblemSolving;

import java.util.Scanner;

public class quickSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        System.out.println("len value");
        quicksort(arr, 0, len - 1);
        System.out.println("IN MAIN");
        printArray(arr, len);
    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void quicksort(int[] array, int left, int right) {
        
        if(left >= right) {
            return;
        }
        int pivot = array[(right+left)/2];
        System.out.println("current pivot = " + pivot);
        //the index will be at the pivot point
        
        int index = partition(array, left, right, pivot);
        System.out.println("current index=" + index);
        printArray(array, array.length);
        //starts from the left until the center (pivot)
        System.out.println("current left: " + left + " current right: " + right + " current index: " + index);
        quicksort(array, left, index -1);
        //starts from the center (pivot) until the right
        System.out.println(" -current left: " + left + "-current right: " + right +  " -current index: " + index);
        quicksort(array, index, right);
    }

    public static int partition(int[] array, int left, int right, int pivot) {
        //iterate from left side and right side simultaneously, and stop when right pointer is bigger than left pointer
        while (left <= right) {
            System.out.println("left is smaller than right");
            //while element on the left is smaller than pivot, keep increments. condition stops when element is bigger or equal to pivot
            while (array[left] < pivot) {
            left++;
            System.out.println("array[left] smaller than pivot, left value:" + left);
            }
            //while element on the right is smaller than pivot, keep increment right pointer. condition stops when element is smaller or equal to pivot
            while(array[right] > pivot) {
                right--;
                System.out.println("array[right] bigger than pivot, right value:" + right);
            }
            //if left pointer is still smaller than the right pointer, swap
            if(left <= right) {
                swap(array, left, right);
                left++;
                right--;
                System.out.println("after, swap, left value: " + left + " right value: " + right) ;
            }
        }
        System.out.println("left value in partition:" + left);
        return left;
    }

    static void swap(int[] arr, int i, int j) {
        System.out.println("enter swap algorithm");
        System.out.println("before, arr[i] is " + arr[i] + " and arr[j] is " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println("after, arr[i] is " + arr[i] + " and arr[j] is " + arr[j]);
    }
}
