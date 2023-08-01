package SortingTechniques;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        System.out.println("This is Quick sorting");
        int[] arr={5,4,3,2,1};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quick(int[] arr,int low, int high) {
        if(low>=high) return;

        int s= low;
        int e=high;
        int mid= s+(e-s)/2;
        int pivot= arr[mid];


        while(s<=e){
            while(arr[s]<pivot) s++;
            while (arr[e]>pivot)e--;

            if(s<=e){
                int tepm= arr[s];
                arr[s]=arr[e];
                arr[e]=tepm;
                s++;
                e--;

            }
        }
        quick(arr,low,e);
        quick(arr,s,high);

    }
}
