package Java_Training.Arrays2D;

import java.util.Scanner;

public class Mat_mult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[m][n];
        int[][] result = new int[m][n];

       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

      
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
              for(int k=0;k<m;k++){
                
                result[i][j] = result[i][j] + (matrix1[i][k] * matrix2[k][j]);
              }
            }
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
