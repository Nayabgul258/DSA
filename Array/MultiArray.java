package Array;

public class MultiArray {
 static int[] MultiArrayBy10(int [] arr){
    int size = arr.length;
    int newArr[] = new int[size];

    for(int i =0; i< size; i++){
        int ele = arr[i];
        int newEle = ele * 10;
        newArr[i] = newEle;
    }
    return newArr;
 }

  public static void main(String[] args) {
     int arr [] = {2,4,3,3,};
     int ans [] = MultiArrayBy10(arr);
     System.out.println("Print Array");
     for(int  i : ans){
        System.out.println(i);
     }
  
     
     }
     //Time complexity O(n)
     //Space Complexity O(n)
    
}