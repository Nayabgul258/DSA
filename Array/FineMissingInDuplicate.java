package Array;

public class FineMissingInDuplicate {
   static int getMissingNumberInDuplicateArray(int arr[]){
       int n = arr.length;

       for(int i =0; i<n ;i++){
        int value = Math.abs(arr[i]);
        int position = value -1;
        if(arr[position] > 0){
            arr[position] = -arr[position];
        }
       }

       for(int i=0; i<n; i++){
        if(arr[i] >0){
            int nextValue = i+1;
         }
       }
       
       return arr;
   }
   public static void main(String[] args) {
    int arr[] = {1,2,2,4,5};
    System.out.println(getMissingNumberInDuplicateArray(arr));
   }
    
}