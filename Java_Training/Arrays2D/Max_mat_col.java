package Java_Training.Arrays2D;

import java.util.Scanner;

public class Max_mat_col {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] f = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                f[i][j] = sc.nextInt();
            }
        }

        int[] max = new int[c];
        for (int i = 0; i < c; i++) {
            int maxi =-1;
            for (int j = 0; j < r; j++) {
                if (f[j][i] > maxi) {
                    maxi = f[j][i];
                }
            }
            max[i] = maxi;
        }

      
        for (int j = 0; j < c; j++) {
            System.out.println(max[j]);
        }
        sc.close();
    }
}
