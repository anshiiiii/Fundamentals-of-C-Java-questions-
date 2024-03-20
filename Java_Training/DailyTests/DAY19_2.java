/*Write a Java program to check whether the given matrix is symmetric or not. Get the row size and column size of the matrix and all the elements of the matrix from the user. [Note: A symmetric matrix is a matrix which is equal to its transpose. Only square matrices are said to be symmetric].

Input Format:

The first line consists of row size and column size of the matrix

The next line consists of all the elements of the matrix



Output Format:

Refer sample output for formatting specifications



Sample Input;

3 3

7 5 1

5 8 3

1 3 4



Sample Output:

The given matrix is symmetric*/

package Java_Training.DailyTests;

import java.util.Scanner;

public class DAY19_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        if (rows != cols) {
            System.out.println("Row and column are not equal");
            return;
        }

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        boolean isSymmetric = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }


        if (isSymmetric) {
            System.out.println("The given matrix is symmetric");
        } else {
            System.out.println("The given matrix is not symmetric");
        }
        scanner.close();
    }
}

