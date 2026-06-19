package Array;

public class MaximumSubArray {
 static int FindMaximumSubArray(int arr[]){
     int n = arr.length;
     int sum = 0;
     int MaxSum = Integer.MIN_VALUE;
     for(int i =0; i<n; i++){
        sum = sum + arr[i];

        if(sum > MaxSum) MaxSum =sum;
        if(sum <0) sum=0;
     }
     return MaxSum;
 }
   public static void main(String[] args) {
    int arr[] ={-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(FindMaximumSubArray(arr));
   } 
}