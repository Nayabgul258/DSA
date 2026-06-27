package Array;

public class SearchPeakEle {
    static int SearchPeakElement(int arr[]) {
        int n = arr.length;
        int Start = 0;
        int End = n - 1;
        int ans = n;

        while (Start <= End) {
            int mid = Start + (End - Start) / 2;
            if (arr[mid] >= arr[mid + 1]) {
                ans = arr[mid];
                End = mid - 1;
            } else {
                Start = mid + 1;
            }

        }
        return ans;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,4,3};
        System.out.println(SearchPeakElement(arr));
    }

}