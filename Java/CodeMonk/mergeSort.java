package CodeMonk;

public class mergeSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
  
        System.out.println("Given Array");
        printArray(arr);  
        sort(arr, 0, arr.length-1);
        System.out.println("\nSorted array");
        printArray(arr);

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void sort(int[] arr, int left, int right) {
        //recursive call until index = 1, (arr size = 1)
        if (left < right) {
            int middle = left + (right-left) / 2;
            sort(arr, left, middle);  //start on left side to middle
            sort(arr, middle+1, right); //start from middle to right
            merge(arr, left, middle, right);
        } 

    }

    static void merge(int[] arr, int left, int middle, int right) {
        
        /* calculate left and right array size */
        int leftN = middle - left +1;
        int rightN = right - middle;
        
        /* create temp arrays */
        int[] leftArr = new int[leftN];
        int[] rightArr = new int[rightN];

        /* transfer elements into temporary array */
        for (int i = 0; i < leftN; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int i = 0; i < rightN; i++) {
            rightArr[i] = arr[middle + 1 + i];
        }


        /* start merge 
            index initialization for 1st and 2nd subarray
            k value = final array pointer
            i value = left array pointer
            j value = right array pointer
        */
        int i = 0, j = 0, k = left;
        /* iterate both left and right subarray */
        while ( i < leftN && j < rightN) {
            //if value in left array is smaller than right array, insert value to current array, else insert right array value
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        /* copy remaining elements of leftArr */
        while ( i < leftN) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        /* copy remaining elements of rightArr */
        while ( i < rightN) {
            arr[k] = rightArr[i];
            i++;
            k++;
        }
    }
}
