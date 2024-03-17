package Java_Training.Arrays2D;

import java.util.Scanner;

public class Up_tri_mat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] arr = new int[size][size];


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

      
        boolean isUpperTriangular = true;
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i][j] != 0) {
                    isUpperTriangular = false;
                    break;
                }
            }
        }

        if (isUpperTriangular) {
            System.out.println("Upper triangular matrix");
        } else {
            System.out.println("Not an Upper triangular matrix");
        }
        sc.close();
    }
}
