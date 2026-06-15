package Array;

public class ShiftArrayBy1 {

    static void ShiftArrayBy1Ele(int arr[]) {
        // step 1:- store last value
        int n = arr.length;
        int temp = arr[n - 1];

        // step 2:- shift all value in arr by one
        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        
        

        arr[0] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1,-2, 3, 5, 8 };
        ShiftArrayBy1Ele(arr);

        for (int a : arr) {
            System.out.println(a + " ");
        }
    }
}