package Practies;

import java.util.Arrays;

/**
 * RunningSumOf1dArray
 */
public class RunningSumOf1dArray {
    static int[] RunningSumOf1dArray(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(RunningSumOf1dArray(arr)));
     
    }

}