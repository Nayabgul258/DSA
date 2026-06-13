package Array;

public class FindAvg {
 

    // Using for Each loop 
   static double getAvg(int arr []){
     double sum =0;
     for( int i : arr){
        sum += i;
     }
     int size = arr.length;
     double avg = sum / size;
     return avg;
   }

    public static void main(String[] args) {
        int arr []={2,4,3,3};
        System.out.println(getAvg(arr));

        // Using for loop 
        // int sum = 0;
        // int arr[] = { 2, 4, 3, 3 };
        // int n = arr.length;
        // for (int i = 0; i < n; i++) {
        //     sum = arr[i] + sum;
        // }
        // double avg = (double) sum / n;
        // System.out.println(avg);

    }

    // Time complexity: O(n)
    // Space complexity: O(1)

}