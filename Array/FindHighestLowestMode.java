package Array;

import java.util.*;

public class FindHighestLowestMode {
   static int[] getHighestLowestModeOfArray(int arr[]) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : arr) {
         frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        int MaxFrequency = Integer.MIN_VALUE;
        int MaxFrequencyKey = -1;

        for(int key : frequency.keySet()){
            int currentFrequency = key;
            int currentFrequencyKey = frequency.get(key);
            if(currentFrequencyKey > MaxFrequency){
                MaxFrequency = currentFrequencyKey;
                MaxFrequencyKey = currentFrequency;
            }
        }


        int MinFrequency = Integer.MAX_VALUE;
        int MinFrequencyKey = -1;

        for(int key : frequency.keySet()){
            int currentFrequency = key;
            int currentFrequencyKey= frequency.get(key);
            if(currentFrequencyKey < MinFrequency){
                MinFrequency = currentFrequencyKey;
                MinFrequencyKey = currentFrequency;
            }
        }

         int ans[] = {MaxFrequencyKey,MinFrequencyKey};
         return ans;

   }


    public static void main(String[] args) {
        int arr[] ={1,2,3,4,2,4,4,};
        int ans[]= getHighestLowestModeOfArray(arr);
        System.out.println(ans[0] +" " +  ans[1]);

    }

}