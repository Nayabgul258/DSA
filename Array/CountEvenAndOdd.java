package Array;

public class CountEvenAndOdd {
    static void CountEvenAndOddElement(int arr[]) {
        int n = arr.length;
        int EvenCount = 0;
        int OddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                EvenCount++;

            } else {
                OddCount++;
            }
        }
            System.out.println("Even Count =" + " " + EvenCount);
            System.out.println("Odd count  =" + " " + OddCount);
        
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 3, 7 };
        CountEvenAndOddElement(arr);

        // int n = arr.length;
        // int EvenCount = 0;
        // int OddCount = 0;
        // for (int i = 0; i < n; i++) {
        // if (arr[i] % 2 == 0) {
        // EvenCount++;
        // } else {
        // OddCount++;
        // }
        // }
        // System.out.println("Even Count =" + " " + EvenCount);
        // System.out.println("Odd count =" + " " + OddCount);

    }

}