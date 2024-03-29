/*Maximum Element In Each Row

There are some students in the class. The class Adviser needs a recruitment's process for above 60% students. In each and every row there was a student above 60% . Help your adviser to find the students in each row.



Input Format:

The input consists of (m*n+2) integers. The first integer corresponds to m, the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in row wise order, first row first, then second row and so on. Assume that the maximum value of m and n is 10.



Output Format:

Refer sample output for details.



Sample Input:

3 2

4 5 6

9 0 3



Sample Output:

5

9

3*/

package Java_Training.DailyTests;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

       
        findMaxInEachRow(matrix, m, n);

        scanner.close();
    }

    public static void findMaxInEachRow(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            int maxInRow = matrix[i][0];
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] > maxInRow) {
                    maxInRow = matrix[i][j];
                }
            }
            System.out.println(maxInRow);
        }
    }
}
