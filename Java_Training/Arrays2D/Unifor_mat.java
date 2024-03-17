/*Rohit likes to play with numbers. He started to frame a matrix called uniformity matrix where he will be using either completely odd numbers or completely even numbers but not both. Write a program to check whether he has framed the matrix in the correct order or not.



Input Format

The input consists of (n*n+1) integers.
The first integer corresponds to the number of rows/columns in the matrix.
The remaining integers correspond to the elements in the matrix.
The elements are read in row-wise order, the first row first, then the second row, and so on.


Output Format

Print Yes if it is a uniformity matrix.
Print No if it is not a uniformity matrix.


Sample Input 

2

4 5

5 4



Sample Output 

No*/

package Java_Training.Arrays2D;

import java.util.Scanner;

public class Unifor_mat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int oddCount = 0, evenCount = 0;

       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

      
        if ((oddCount == 0 && evenCount == n * n) || (evenCount == 0 && oddCount == n * n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
