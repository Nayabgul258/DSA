package Array;

import java.util.Arrays;

public class ThreeSum {
    static int [] ThreeSumArray(int arr[], int target){
       int n = arr.length;
       for(int i =0; i< n-2; i++){
        for(int j = i+1; j<n-1; j++){
            for(int k=i+2; k < n; k++){
                if(arr[i] + arr[j] + arr[k] == target){
                    return new int[] {arr[i],arr[j],arr[k]};
                }
            }
        }
       }
       return new int[]{};
    }

    public static void main(String[] args) {
        int arr[] ={1,5,6,7,4,3};
        System.out.println(Arrays.toString(ThreeSumArray(arr,8)));
    }
    
}