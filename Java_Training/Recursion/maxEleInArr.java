package Java_Training.Recursion;

import java.util.Scanner;

class Main {

    public static int findMax(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        else
            return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        System.out.println("Maximum element in the array is " + findMax(arr, n));
        scanner.close();
    }
}
