package Java_Training.Recursion;

import java.util.Scanner;

class Main {
    
    public static int arraySum(int[] arr, int n) {
        if (n <= 0)
            return 0;
        return (arraySum(arr, n - 1) + arr[n - 1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        System.out.println(arraySum(arr, n));
        scanner.close();
    }
}

