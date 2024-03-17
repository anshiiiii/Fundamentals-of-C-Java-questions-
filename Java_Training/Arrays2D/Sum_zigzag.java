package Java_Training.Arrays2D;

import java.util.Scanner;

public class Sum_zigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[][] a = new int[n1][n2];
        int sum = 0;

        // Input: Matrix elements
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

      
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (i == 0 || i == n1 - 1 || j == n2 - 1 - i) {
                    sum += a[i][j];
                }
            }
        }

        System.out.println("Sum of Zig-Zag pattern is " + sum);
        sc.close();
    }
}
