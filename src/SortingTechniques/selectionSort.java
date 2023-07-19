package SortingTechniques;

import java.util.Arrays;

public class selectionSort {
    //    Basic idea:
//    1:Loop in array
//    2:Get MAX number
//    3:Swap Max number with last index

    public static void main(String[] args) {
        System.out.println("This is selection sort");
        int[] arr={5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
            int maxNum=max(arr,0,last);
            swap(arr,maxNum,last);
        }
    }

    public static int max(int[] arr, int start, int last) {
        int max=start;
        for (int j = start; j <= last; j++) {
            if(arr[j]>arr[max])
                max=j;
        }
        return max;
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


}
