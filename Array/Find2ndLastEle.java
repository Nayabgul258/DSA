package Array;

public class Find2ndLastEle {
  static int Find2ndLastElement(int arr[]){
      int n = arr.length;
      int largeValue =0;
      int SecondLargeValue = 0;
      for(int  i=0; i<n; i++){
        if(arr[i] > largeValue){
            SecondLargeValue = largeValue;
            largeValue = arr[i];
        }
      }
      return SecondLargeValue;
  }
  public static void main(String[] args) {
    int arr [] ={1,3,5,7,4,9};
    int ans = Find2ndLastElement(arr);
    System.out.println("Second Large Element:-" + " "+ ans);
  }
    
}