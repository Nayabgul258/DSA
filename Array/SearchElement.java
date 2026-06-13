package Array;

public class SearchElement {
    static boolean findTarget(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 9 };
        boolean ans = findTarget(arr, 60);
        System.out.println(ans);
    }

    //Time complexity O(n);
    //Space complexityO(1);
}
