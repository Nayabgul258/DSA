package Array;

public class ZeroOneCount {

    static int[] getZeroOneCount(int arr[]) {
        int ZeroCount = 0;
        int OneCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                ZeroCount++;
            } else {
                OneCount++;
            }
        }

        int ans[] = { ZeroCount, OneCount };
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 0, 1, 0, 1, 3 };
        int ans[] = getZeroOneCount(arr);
        
        System.out.println("zeroCount:- " + ans[0]);
        System.out.println("oneCount:- " + ans[1]);
    }
}