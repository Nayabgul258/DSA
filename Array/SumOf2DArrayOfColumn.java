package Array;

public class SumOf2DArrayOfColumn {
    static void SumOf2DArrayOfColumn(int arr[][]) {
        int m = arr[0].length;
        int n = arr.length;
        for (int column = 0; column < n; column++)  {
            int sum = 0;
            for (int row = 0; row < m; row++) {
             sum = sum + arr[row][column];

            }
            System.out.println("column " + column + " sum =" + " "+ sum);
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 4, 5, 6 } };
        SumOf2DArrayOfColumn(arr);

    }

}