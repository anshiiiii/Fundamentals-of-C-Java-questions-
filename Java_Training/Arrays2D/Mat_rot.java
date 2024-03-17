//rotate the matrix by 90 degrees in clockwise direction

package Java_Training.Arrays2D;

import java.util.Scanner;

public class Mat_rot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

