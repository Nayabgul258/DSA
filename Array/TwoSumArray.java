package Array;

import java.util.Arrays;

public class TwoSumArray {

    static int[] TwoSum(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{arr[i], arr[j]};
                  
                }
            }
        }
         return new int[]{};
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 6, 7 };
    

        System.out.println(Arrays.toString(TwoSum(arr, 5)));
    }
}