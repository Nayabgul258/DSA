package Array;

public class BubbleSort {
    static void BubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr [] = {9,5,1,3};
        BubbleSort(arr);

        for(int i =0; i< arr.length; i++){
            System.out.println("Sorted Array " + arr[i] );
        }
    }

    // Bubble Sort me Har ek Adjustment element ke sath compare 
    //karte hai aur Big value ko Low value se swap karte h 
    // Tc = O(n2) 
    // Sc = O(1)

    //Agar array sorted ho tab  Tc = O(n) hoga.

}