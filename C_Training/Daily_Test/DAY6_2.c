/*Write a C program to multiply the given two matrices

Multiply two matrices according to the rule of matrix multiplication.

Sample Input:

2 3

1 2 3

3 4 5

2 3

1 2 3

3 4 5

Sample Output:

matrices cant be multiplied*/
#include <stdio.h>


int main() {
    int mat1[100][100], mat2[100][100], result[100][100];
    int rows1, cols1, rows2, cols2;


    scanf("%d %d", &rows1, &cols1);
    for (int i = 0; i < rows1; i++) {
        for (int j = 0; j < cols1; j++) {
            scanf("%d", &mat1[i][j]);
        }
    }

    scanf("%d %d", &rows2, &cols2);
    for (int i = 0; i < rows2; i++) 
    {
        for (int j = 0; j < cols2; j++) 
        {
            scanf("%d", &mat2[i][j]);
        }
    }

  
    if (cols1 != rows2) 
	{
        printf("The matrices can't be multiplied with each other.\n");
      
    }
    else
	{
    for (int i = 0; i < rows1; i++) 
	{
        for (int j = 0; j < cols2; j++) 
		{
            result[i][j] = 0;
            for (int k = 0; k < cols1; k++) 
			{
                result[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }


    for (int i = 0; i < rows1; i++) 
	{
        for (int j = 0; j < cols2; j++) 
		{
            printf("%d ", result[i][j]);
        }
        printf("\n");
    }
	}

    return 0;
}