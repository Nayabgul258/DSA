package Array;

public class FindMissingEle {

    static int FindMissingElement(int arr [], int m ){
        int n = arr.length;
        int XorSum = 0;
        
        for(int num:  arr){
            XorSum = XorSum ^ num;
        }
        for(int i =0; i <= n; i++){
            XorSum = XorSum ^ i;
        }
        return XorSum;
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,5,0};
        int  m = 5;
        System.out.println(FindMissingElement(arr,m));
    }

    //Time complexity O(n)
    //Space complexity O(1)
}