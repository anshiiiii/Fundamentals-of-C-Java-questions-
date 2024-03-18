package Java_Training.Recursion;

import java.util.Scanner;

class Main {

    public static int sumOdd(int[] arr, int n) {
        if (n <= 0)
            return 0;
        else if (arr[n - 1] % 2 != 0)
            return arr[n - 1] + sumOdd(arr, n - 1);
        else
            return sumOdd(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        System.out.println("Sum = " + sumOdd(arr, n));
        scanner.close();
    }
}
