package org.logical;

import java.util.Arrays;

public class InsertionSortRemovingFirstOrLastElement {
    public static void logic(int[] arr,int elementToInsert){
        arr[arr.length-1] = elementToInsert;
        // applying insertion sort logic
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >=0  && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {22,11,44,55,77,88};
        int elementToInsert = 20;
        logic(arr,elementToInsert);
    }
}
