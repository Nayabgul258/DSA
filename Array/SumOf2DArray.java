package Array;

public class SumOf2DArray {
    static void sumOf2DArrayElement(int arr[][]) {
  int row = arr.length;
    int column = arr[0].length;
    for (int i = 0; i < row; i++) {
    int sum = 0;
    for (int j = 0; j < column; j++) {
    sum = sum + arr[i][j];

    }
    System.out.println("Row " + i + " Sum = " + sum);
    }
}

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 3, 4, 5, 6 } };
        sumOf2DArrayElement(arr);
        

    }
}
