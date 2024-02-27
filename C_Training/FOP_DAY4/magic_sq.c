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
#include <stdio.h>

int main() {
    int n, Diag1 = 0, Diag2 = 0, i, j;

    scanf("%d", &n);

    int Matrix[n][n];


    for(i = 0; i < n; i++) {
        for(j = 0; j < n; j++) {
            scanf("%d", &Matrix[i][j]);
        }
    }

    // Calculate the sum of the main diagonal and the anti-diagonal
    for(i = 0; i < n; i++) {
        for(j = 0; j < n; j++) {
            if(i == j) {
                Diag1 += Matrix[i][j];
            }
            if(i + j + 1 == n) {
                Diag2 += Matrix[i][j];
            }
        }
    }

    if(Diag1 == Diag2) {
        printf("Yes\n");
    } else {
        printf("No\n");
    }

    return 0;
}
