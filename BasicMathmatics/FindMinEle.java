package BasicMathmatics;

public class FindMinEle {
//    static int FindMinElementInArray(int arr[]){
//         int n = arr.length;
//         int Min = arr[0];
//         for(int i=0; i< n; i++){
//             if(arr[i] < Min){
//                 Min = arr[i];
//             }
//         }
//         return Min;
//    }
   public static void main(String[] args) {
    int arr[] ={9,4,3,6,2};
    //int ans = FindMinElementInArray(arr);
      
     //for each loop 
    int min= arr[0];
    for(int ans : arr){
        if(ans < min );
        min = ans;
    }
    System.out.println("Min Element is :-" + " "+ min);
   }
   //Tc O(n)
   //Sc O(1)
    
}