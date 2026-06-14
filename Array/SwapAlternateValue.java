package Array;

public class SwapAlternateValue {
    static int[] SwapAlternat(int arr[]) {
        for (int i = 0, j = 1; j < arr.length; i += 2 , j += 2) {
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
            return arr;
        }
        
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int ans[] = SwapAlternat(arr);

        for (int num : ans) {
            System.out.print(num + " ");
        }

    }

    // Time Complexity O(n);
    // Space Complexity O(1)

}