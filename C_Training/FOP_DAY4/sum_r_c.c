/*Ram has a fruit shop. He has arranged some set of fruits in the column and row-wise. Ram needs to find which row and column have a maximum number of fruits. Help him to find out.



Input Format

Input consists of 2 integers(size of rows and columns) and 1 2D array.



Output Format

The output prints the sum of all rows and columns as well as print the row and column which has the maximum sum. Refer to the sample output.



Sample Input 1

3

3

1 6 8

2 5 1

3 8 2



Sample Output 1

The Sum of rows is 15 8 13

Row 1 has a maximum sum

The Sum of columns is 6 19 11

Column 2 has the maximum sum*/
#include<stdio.h>

int main() {
    int m, n, row, col, sum = 0;
    int max_row_sum = 0, max_col_sum = 0;
    int max_row_index = 0, max_col_index = 0;

 
    scanf("%d %d", &m, &n);

    int mat[m][n];
    

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            scanf("%d", &mat[i][j]);
        }
    }

    // Calculate sum of rows
    printf("The Sum of rows is ");
    for (row = 0; row < m; row++) {
        sum = 0;
        for (col = 0; col < n; col++) {
            sum += mat[row][col];
        }
        printf("%d ", sum);
        if (sum > max_row_sum) {
            max_row_sum = sum;
            max_row_index = row + 1;
        }
    }
    printf("\n");

    // Identify row with maximum sum
    printf("Row %d has a maximum sum\n", max_row_index);

    // Calculate sum of columns
    printf("The Sum of columns is ");
    for (col = 0; col < n; col++) {
        sum = 0;
        for (row = 0; row < m; row++) {
            sum += mat[row][col];
        }
        printf("%d ", sum);
        if (sum > max_col_sum) {
            max_col_sum = sum;
            max_col_index = col + 1;
        }
    }
    printf("\n");

    // Identify column with maximum sum
    printf("Column %d has the maximum sum\n", max_col_index);

    return 0;
}
