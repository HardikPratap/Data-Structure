package SortingTechniques;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        System.out.println("This is Bubble sorting");
        int[] arr={5,4,3,2,1};
        arr=merge(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] merge(int[] arr) {
        if(arr.length==1) return arr;

        int mid= arr.length/2;

        int[] left=merge(Arrays.copyOfRange(arr,0,mid));
        int[] right=merge(Arrays.copyOfRange(arr,mid+1,arr.length));

        return mergeArr(left,right);

    }

    private static int[] mergeArr(int[] left, int[] right) {
        int[] mix= new int[left.length+ right.length];
        int i=0,j=0,k=0;

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }
            else {
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mix[k]=right[i];
            j++;
            k++;
        }

        return mix;
    }

}
