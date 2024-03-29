/*Pascal's triangle isn't just a neatly arranged stack of numbers. It has more secrets and patterns than you can imagine. Check it out yourself. Compute Pascal's triangle up to a given number of rows using lambda expressions.

In Pascal's Triangle each number is computed by adding the numbers to the right and left of the current position in the previous row.

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
# ...  etc


Sample Input1:

5

Sample Output1:

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1


Sample Input2:

0

Sample Output2:

Invalid Input*/

package Java_Training.DailyTests;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();

        if (numRows < 1) {
            System.out.println("Invalid Input");
        } else {
            for (int i = 0; i < numRows; i++) {
                int number = 1;
                // Print leading spaces
                for (int j = 0; j < numRows - i; j++) {
                    System.out.print(" ");
                }
				
                // Calculate and print the numbers in the row
                for (int j = 0; j <= i; j++) {
                    System.out.print(number + " ");
                    number = number * (i - j) / (j + 1);
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numRows = scanner.nextInt();

        generatePascalsTriangle(numRows);
    }

    public static void generatePascalsTriangle(int numRows) {
        if (numRows <= 0) {
            System.out.println("Invalid Input");
            return;
        }


        int[][] triangle = new int[numRows][];
        triangle[0] = new int[]{1};

        for (int i = 1; i < numRows; i++) {
            final int[] prevRow = triangle[i - 1];
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;

          
            for (int j = 1; j < i; j++) {
                triangle[i][j] = prevRow[j - 1] + prevRow[j];
            }

            triangle[i][i] = 1;
        }

     
        for (int[] row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}*/
