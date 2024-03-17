/*A magic square is an arrangement of numbers (usually integers) in a square grid, there are numbers in the forward and backward main diagonals, all add up to the same number. Write a program to find whether a given matrix is a magic square or not.



Input Format

The input consists of (n*n+1) integers.
The first integer corresponds to the number of rows/columns in the matrix.
The remaining integers correspond to the elements in the matrix.
The elements are read in row-wise order, the first row first, then the second row, and so on.


Output Format

Print yes if it is a magic square.
Print no if it is not a magic square.


Sample Input 1

2

4 5

5 4



Sample Output 1

No

*/

package Java_Training.Arrays2D;

import java.util.Scanner;

public class Magic_square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += matrix[i][i];
            diag2 += matrix[i][n - i - 1];
        }

        if (diag1 == diag2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}

