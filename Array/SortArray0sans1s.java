package Array;

public class SortArray0sans1s {
    static int[] SortArray0sans1sEle(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }

        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 1, 0, 0, 1 };
        int ans[] = SortArray0sans1sEle(arr);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }

    //Time complexity O(n)
    //Space complexity O(1)

}