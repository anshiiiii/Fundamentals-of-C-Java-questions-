/*Celebrity Problem

A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N people, find if there is a celebrity in the party or not.

A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j is set to 1 it means ith person knows jth person. Here M[i][i] will always be 0.

Note: Follow 0 based indexing.

Follow Up: Can you optimize it to O(N)



Input Format

First integer input represents the number of people in the party, (n). The next n*n integer input represent the acquaintance matrix of all people in the party.



Output Format

Prints the Identity of the celebrity if exists(O based indexing) , if celebrity is not present then it prints "No Celebrity ".



Sample Input

4

MATRIX = 0 1 1 0 

         0 0 1 0

         0 0 0 0

         1 1 1 0

Sample Output

id = 2



Explanation

The person with ID 2 does not know anyone but everyone knows him*/

package Java_Training.DailyTests;

import java.util.Scanner;

public class DAY19_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int candidate = 0;
        for (int i = 1; i < n; i++) {
            if (knows(matrix, candidate, i)) {
                candidate = i;
            }
        }

        boolean isCelebrity = true;
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                if (knows(matrix, candidate, i) || !knows(matrix, i, candidate)) {
                    isCelebrity = false;
                    break;
                }
            }
        }

        if (isCelebrity) {
            System.out.println("" + candidate);
        } else {
            System.out.println("No Celebrity");
        }

        scanner.close();
    }

    private static boolean knows(int[][] matrix, int a, int b) {
        return matrix[a][b] == 1;
    }
}