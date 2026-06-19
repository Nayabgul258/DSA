package BasicMathmatics;

public class FinndMaxElement {
   static int FindMaxElementInArray(int arr []){
       int n = arr.length;
       int max = arr[0];
       for(int i =0; i < n ; i++){
        if(arr[i] > max){
            max = arr[i];
        }
       }
       return max;
   }
   public static void main(String[] args) {
    int arr[] ={ 1,2,5,4,9,77};
    int Max = FindMaxElementInArray(arr);
    System.out.println("Max Element is :-" +" "+  Max);
   }

   // Tc = O(n);
   //Sc = O(1);
    
}