package Array;

public class SelectionSort {
    static void SelectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        int arr [] ={5,6,4,13};
        SelectionSort(arr);

        for(int value : arr){
            System.out.print(value + " ");
        }
    }
    // Selection sort me min value consider karke arr par iterate karte h 
    //phir usseswap karte h 
    // Tc = O(n2)
    //Sc = O(1)
    // Array sorted ho to O(n) lagega
}