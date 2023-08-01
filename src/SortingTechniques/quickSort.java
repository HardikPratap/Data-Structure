package SortingTechniques;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        System.out.println("This is Bubble sorting");
        int[] arr={5,4,3,2,1};
        int[] ans=merge(arr);
        System.out.println(Arrays.toString(ans));
    }
}
