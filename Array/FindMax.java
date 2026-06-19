package Array;

public class FindMax {

    // using Method
    // static int getMax(int arr[]) {
    // int max = arr.length;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > max) {
    // max = arr[i];
    // }
    // }
    // return max;

    // }

    public static void main(String[] args) {
        // int arr[]={2,8,9,6,44,4};
        // int ans = getMax(arr);
        // System.out.println(ans);

        int arr[] = { 1, 4, 6, 8, 6, 7 };
        int max = arr[0];


        //Using for each loop
        for (int num : arr) {
            if (num > max) {
                max = num;
            }

        }
     
        System.out.println("Maximum Element:- " + max);
    }

}