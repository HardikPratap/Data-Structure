package SortingTechniques;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        System.out.println("This is selection sort");
        int[] arr={5,4,3,2,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr[j],arr[j-1]);
                }
                else break;
            }

        }
    }
    private static void swap(int first, int second) {

    }


}
