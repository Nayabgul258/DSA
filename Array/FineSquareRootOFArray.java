package Array;

public class FineSquareRootOFArray {

    static int FindSqrt(int n) {
        int Start = 0;
        int End = n;
        int ans = n;

        while (Start <= End) {
            int mid = Start + (End - Start) / 2;
            if (mid * mid == n)
                return mid;
            else if (mid * mid > n) {
                End = mid - 1;

            } else {
                ans = mid;
                Start = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 56;
        int ans = FindSqrt(n);
        System.out.println(ans);

    }
}