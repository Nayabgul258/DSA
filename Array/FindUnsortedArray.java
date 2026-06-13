package Array;

public class FindUnsortedArray {
    static int getUnsortedArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] <= arr[i]) {
                return arr[i + 1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 7, 3 };
        System.out.println(getUnsortedArray(arr));
    }
    //Time Complexity = O(n);
    //Space Complexity = O(1);

}