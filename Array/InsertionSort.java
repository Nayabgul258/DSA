package Array;

public class InsertionSort {
    static void InsertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int current = i;
            int previous = i - 1;
            int currentValue = arr[i];
            while (previous >= 0 && currentValue < arr[previous]) {
                arr[previous + 1] = arr[previous];
                previous--;
            }
            arr[previous + 1] = currentValue;

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