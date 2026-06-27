package Array;

/**
 * FindPivotInRotateArray
 */
public class FindPivotInRotateArray {
    static int FindPivotInRotateArray(int arr[]) {
        int n = arr.length;
        int Start = 0;
        int End = n - 1;
        int ans = n;

        while (Start <= End) {
            int mid = Start + (End - Start) / 2;
            if (arr[mid] < arr[n - 1]) {
                End = mid - 1;
            } else {
                ans = arr[mid];
                Start = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 50, 60, 70, 10, 20, 30, 40 };
        System.out.println(FindPivotInRotateArray(arr));
    }

}