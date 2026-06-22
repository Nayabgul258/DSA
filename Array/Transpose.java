package Array;

public class Transpose {
    static int[][] Transpose2DArray(int arr[][]) {

        int TotalRow = arr.length;
        int TotalColumn = arr[0].length;
        int newTotalRow = TotalColumn;
        int newTotalColumn = TotalRow;

        int Transpose[][] = new int[newTotalRow][newTotalColumn];
        for (int i = 0; i < TotalRow; i++) {
            for (int j = 0; j < TotalColumn; j++) {
                Transpose[j][i] = arr[i][j];
            }
        }
        return Transpose;

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 },{7,8,9}};
        int ans [][] = Transpose2DArray(arr);

         for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
       
    
}