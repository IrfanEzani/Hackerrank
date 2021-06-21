package ProblemSolving;

import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {

       Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //length
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        int temp = arr[arr.length - 1]; // last index

        /*  for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("i value:" + i + " arr[i] value:" + arr[i]);
            System.out.println("current arr:"); 
            for (int k : arr) {
                System.out.print(k + " ");
            }
            System.out.println();
            for (int j = i - 1; j >= 0; j--) {
                System.out.println("j value:" + j + " arr[j] value:" + arr[j]);
                if (arr[j] < temp) {
                    arr[i] = temp;
                    temp = arr[arr.length-1];
                    System.out.println("FOUND");
                    System.out.println("->" + temp + ">" + arr[j]);
                    System.out.println("!--updated arr[i] value:" + arr[i] + "--!");
                    break;
                }
                if(arr[j] > temp) {
                    arr[i] = arr[j];
                    System.out.println("!!!updated arr[i] value:" + arr[i] + "!!!");
                    break;
                } 
            }
        } */
        for (int i = n-2; i >= 0; i--) {
            //if last elem is bigger then current element
            if(arr[i] < temp) {
                System.out.println("temp, " + temp + " is bigger then current elem, " + arr[i]);
                System.out.println("===> " + temp + " > " + arr[i]);
                System.out.println("now, arr[i+1], " + arr[i+1] + " equals to temp, " + temp);
                arr[i+1] = temp;
                print(arr);
                break;
            } else {
                System.out.println("temp, " + temp + " is smaller then current elem, " + arr[i]);
                System.out.println("now, arr[i+1], " + arr[i+1] + " equals to arr[i] " + arr[i]);
                arr[i+1]=arr[i];
                print(arr);
                if(i==0)
                {
                    arr[i]=temp;
                    print(arr);
                }
            }
        }
    }

    static void print(int a[])
    {
        for(int i:a)
        System.out.print(i+" ");
        System.out.println();
    }
}

/* 2 4 6 8 3 */