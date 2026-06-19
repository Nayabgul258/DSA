package Array;

public class SumOfAllEle {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 4, 3 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum = arr[i] + sum;
        }
       System.out.println(sum);
    }

}