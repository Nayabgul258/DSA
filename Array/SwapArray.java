package Array;

public class SwapArray {

    static int[] SwapArrayEle(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 2,5,67,8 };
        int ans[] = SwapArrayEle(arr);

        for (int num : ans) {
            System.out.print(num + " ");
        }
        // System.out.println(SwapArrayEle(arr));
    }
}