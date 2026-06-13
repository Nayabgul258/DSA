package Array;

public class SumOfNo {
    static int[] getNumber(int arr[]) {
        int positiveSum = 0;
        int negativeSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveSum = positiveSum + arr[i];
            }else {

            negativeSum = negativeSum + arr[i];
            }
        }

        int ans[] = {positiveSum , negativeSum};
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = {1,-3,7,-2,-4,};
        int ans[]= getNumber(arr);
        System.out.println("positive:-" + ans[0]);
        System.out.println("negative:- " + ans[1]);
    }

    //Time complexity = O(n);
    //space xomplexity =O(1);

}