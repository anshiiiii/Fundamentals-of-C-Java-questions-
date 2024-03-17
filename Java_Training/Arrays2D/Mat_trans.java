package Java_Training.Arrays2D;

import java.util.Scanner;

public class Mat_trans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

