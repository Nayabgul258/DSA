package Array;

public class CountTargetOccurrence2 {
    static int countLowerBound(int arr[], int target) {
        int n = arr.length;
        int Start = 0;
        int End = n - 1;
        int LB = n;

        while (Start <= End) {
            int mid = Start + (End - Start) / 2;

            if (arr[mid] >= target) {
                LB = mid;
                End = mid - 1;
            } else {
                Start = mid + 1;

            }
        }
        return LB;
    }

    static int CountUpperBound(int arr[], int target) {
        int n = arr.length;
        int Start = 0;
        int End = n - 1;
        int UB = n;

        while (Start <= End) {
            int mid = Start + (End - Start) / 2;
            if (arr[mid] <= target) {
                Start = mid + 1;

            } else {
                UB = mid;
                End = mid - 1;

            }
        }
        return UB;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 30, 30, 30, 40, 40 };
        int target = 10;
        int LbIndex = countLowerBound(arr, target);
        int UbIndex = CountUpperBound(arr, target);
        int ans = UbIndex - LbIndex;
        System.out.println("TotalOccurrence = " + ans);
    }

}