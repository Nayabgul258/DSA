package Array;

public class CountTargetOccurrence {
    static int countOccurrences(int arr[], int target) {
         int count = 0;
         for(int value : arr) {    // for loop given TC = O(n)
            if (target == value) {
                count++;
            }
         }
         return count;
        }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 6 };
        System.out.println(countOccurrences(arr,5));
      
    }

}