package Array;

public class RotateArray90 {
    static void RotateArray90Degree(int arr[][]) {
        // transpose array in place
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
        // Reverse transpose array to output
        for (int i = 0; i < n; i++) {
            int StartColumn = 0;
            int endColumn = n - 1;
            while (StartColumn < endColumn) {
                int temp = arr[i][StartColumn];
                arr[i][StartColumn] = arr[i][endColumn];
                arr[i][endColumn] = temp;
                StartColumn++;
                endColumn--;
                
            }
        }
       

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 } };
        RotateArray90Degree(arr);

        for(int i  =0; i<arr.length; i++){
            for(int j =0; j< arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
              System.out.println();
        }
      

    }

}



