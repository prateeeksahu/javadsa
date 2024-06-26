package practice.timeComplexity;

import java.util.*;

public class partioningTwoArrays {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int pivot = scn.nextInt();
        partition(arr,pivot);
        print(arr);
    }

    public static void partition(int[] arr, int pivot){
       int i = 0;
       int j = 0;

       while(i < arr.length){
           if(arr[i] > pivot){
               i++;
           } else {
               swap(arr, i, j);
               i++;
               j++;
           }
       }


    }


    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



}