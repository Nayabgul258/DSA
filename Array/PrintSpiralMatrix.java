package Array;

public class PrintSpiralMatrix {
    static void printSpiralMatrix(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;

        int startingRow = 0;
        int endingRow = m - 1;

        int startingColumn = 0;
        int endingColumn = n - 1;

        while(startingRow <= endingRow && startingColumn <= endingColumn) {

            // left -> Right
            for (int i = startingColumn; i <= endingColumn; i++) {
                System.out.println(arr[startingRow][i]);
            }
            startingRow++;

            // Top -> Bottom
            for (int i = startingRow; i <= endingRow; i++) {
                System.out.println(arr[i][endingColumn]);
            }
            endingColumn--;

            // Right ->left
            for (int i = endingColumn; i >= startingColumn; i--) {
                System.out.println(arr[endingRow][i]);
            }
            endingRow--;

            // Down -> Up
            for (int i = endingRow; i >= startingRow; i--) {
                System.out.println(arr[i][startingColumn]);
            }
            startingColumn++;
        }

    }
    public static void main(String[] args) {
        int arr [][]= {
            {1,2,3,},
           {4,5,6},
           {7,8,9}
        };
        printSpiralMatrix(arr);


       
    }
    // output -> 1 2 3 6 9 8 7 4 5
    // Tc -> O(row * col ) = O(n2);
    //Sc -> O(1);
    // DSA Pattern 2D Matrix Traversal + Boundary Traversal


}