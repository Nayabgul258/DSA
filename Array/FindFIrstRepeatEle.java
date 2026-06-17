package Array;
import java.util.*;

public class FindFIrstRepeatEle {

    //Optimal Approach  Tc = O(n)  Sc = O(n)
    static int FindFIrstRepeatElement(int arr[]) {
      Map<Integer,Integer > frequency = new HashMap<>();

      for(int num : arr){
        frequency.put(num, frequency.getOrDefault(num, 0)+1);
      }

      for(int num1 : arr){
        if(frequency.get(num1) >1){
            return num1;
        }
      }

       return -1;


        // Brute Force Approach Tc= o(n2) Sc= O(1)
        // int n = arr.length;
        // for(int i =0; i< n-1; i++){
        // for(int j = i+1; j< n; j++){
        // if(arr[i] == arr[j]) return arr[i];
        // }
        // }
        // return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 4, 4, 3 };
        System.out.println(FindFIrstRepeatElement(arr));
    }
}