package Java_Training.Arrays2D;

import java.util.Scanner;

public class Sum_r_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.print("The Sum of rows is ");
        int maxRowSum = Integer.MIN_VALUE;
        int maxRowIndex = 0;
        for (int row = 0; row < m; row++) {
            int rowSum = 0;
            for (int col = 0; col < n; col++) {
                rowSum += mat[row][col];
            }
            System.out.print(rowSum + " ");
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                maxRowIndex = row + 1;
            }
        }
        System.out.println();

        System.out.println("Row " + maxRowIndex + " has a maximum sum");

  
        System.out.print("The Sum of columns is ");
        int maxColSum = Integer.MIN_VALUE;
        int maxColIndex = 0;
        for (int col = 0; col < n; col++) {
            int colSum = 0;
            for (int row = 0; row < m; row++) {
                colSum += mat[row][col];
            }
            System.out.print(colSum + " ");
            if (colSum > maxColSum) {
                maxColSum = colSum;
                maxColIndex = col + 1;
            }
        }
        System.out.println();


        System.out.println("Column " + maxColIndex + " has the maximum sum");
        scanner.close();
    }
}
