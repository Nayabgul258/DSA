package Array;

public class PrintAlterNateManner {
    static void PrintAlterNateMannerArray(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (i == j) {
                System.out.print(arr[i] +" ");
                return;

            } else {
                System.out.print(arr[i] + " ");
                i++;
                System.out.print(arr[j] + " ");
                j--;
            }
            
        }

        // using for loop
        // for(int i =0,j=n-1; i< n; i++,j--){
        // if(i > j ){
        // return;
        // }
        // if(i == j){
        // System.out.println(arr[i]);
        // }else{
        // System.out.println(arr[i]);
        // System.out.println(arr[j]);
        // }

        // }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        PrintAlterNateMannerArray(arr);
   }

}