package Array;

public class WavePrintUsingArray {
    static void WavePrintUsingArray(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < col;i++){
            if (i % 2 == 0) {
                for (int j = 0; j < row; j++) {
                    System.out.println(arr[i][j]);
                }
            } else {
                for (int j = row - 1; j >= 0; j--) {
                    System.out.println(arr[i][j]);
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
        WavePrintUsingArray(arr);
    }

}