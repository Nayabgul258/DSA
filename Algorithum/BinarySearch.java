package Algorithum;

public class BinarySearch {
    static int BinarySearch(int arr[], int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9, 13, 32, 45 };
        // int target = 45;
        int value = BinarySearch(arr, 13);

        if (value != -1) {
            System.out.println("Element found at index: " + value);
        } else {
            System.out.println("Element not found");
        }

        // for(int value : arr){
        // System.out.println("Target no is = " + value);
        // }

    }

}