package Array;

public class FindUniqueEle {

    static int FindUniqueElement(int arr[],int m) {
       int XorSum = 0;

       for(int num : arr){
        XorSum = XorSum ^ num;
      

       }
       return XorSum;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,3,5,3};
        int m = 5;
        System.out.println(FindUniqueElement(arr,m));
    }
}