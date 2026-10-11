package DivideConquer;

import java.util.Arrays;

public class QuickSort {

    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];

        int i = low-1;
        for (int j = low; j <= high-1; j++) {
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr,i+1, high);
        return i+1;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quicksort(int[]arr, int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);
            System.out.println(pi + " Position of pivot");
            quicksort(arr, low, pi-1);
            quicksort(arr,pi+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;

        quicksort(arr,0, n-1);
        for (int i: arr){
            System.out.print(i + " ");
        }
    }
}

