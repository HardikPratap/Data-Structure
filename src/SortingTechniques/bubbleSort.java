package SortingTechniques;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        System.out.println("This is Bubble sorting");
        int[] arr={5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubble(int[] arr) {
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap=false;
            for (int j =1; j < arr.length ; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }

            }
            if (!swap) break;
        }
    }

}
