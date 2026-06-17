package Array;

public class FindFIrstRepeatEle {
    static int FindFIrstRepeatElement(int arr[]){
      int n = arr.length;
      for(int i =0; i< n-1; i++){
        for(int j = i+1; j< n; j++){
            if(arr[i] == arr[j]) return arr[i];
        }
      }
      return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,7,4,4,3};
        System.out.println(FindFIrstRepeatElement(arr));
    }
}