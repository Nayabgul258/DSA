package Array;

public class InsertionSort {
    static void InsertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }

            // int current = i;
            // int previous = i - 1;
            // int currentValue = arr[i];
            // while (previous >= 0 && currentValue < arr[previous]) {
            // arr[previous + 1] = arr[previous];
            // previous--;
            // }
            // arr[previous + 1] = currentValue;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 2, 3 };
        InsertionSort(arr);

        for (int value : arr) {
            System.out.print(value + " ");
        }

    }
}