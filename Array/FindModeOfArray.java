package Array;

import java.util.*;

import java.util.Map;

public class FindModeOfArray {

    static int getMode(int arr[]) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        int MaxFrequency = -1;
        int MaxFrequencyKey = -1;

        for (int key : frequency.keySet()) {
            int currentFrequency = key;
            int currentFrequencyKey = frequency.get(key);
            if (currentFrequencyKey > MaxFrequency) {
                MaxFrequency = currentFrequencyKey;
                MaxFrequencyKey = currentFrequency;
            }

        }
        return MaxFrequencyKey;
        // check frequency count
        // for(int i :frequency.keySet()){
        // System.out.println(i + " " + frequency.get(i));
        // }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4 };
        int ans = getMode(arr);
        System.out.println(ans);
    }

    //Time complexity O(n)
    //Space Complexity O(1)
}
