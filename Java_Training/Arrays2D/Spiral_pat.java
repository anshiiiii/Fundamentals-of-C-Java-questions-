/*Sample Input 1

3

1 2 3

4 5 6

7 8 9



Sample Output 1

1 2 3 6 9 8 7 4 5*/

package Java_Training.Arrays2D;

import java.util.Scanner;

public class Spiral_pat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int round = (int) Math.ceil((double) n / 2);
        for (int i = 0; i < round; i++) {
            // Left to right
            for (int j = i; j <= n - i - 1; j++) {
                System.out.print(a[i][j] + " ");
            }
            // Top to bottom
            for (int j = i + 1; j <= n - i - 1; j++) {
                System.out.print(a[j][n - i - 1] + " ");
            }
            // Right to left
            for (int j = n - i - 2; j >= i; j--) {
                System.out.print(a[n - i - 1][j] + " ");
            }
            // Bottom to top
            for (int j = n - i - 2; j > i; j--) {
                System.out.print(a[j][i] + " ");
            }
        }
        scanner.close();
    }
}

