/*Irene who is one of the organizers of the event has arranged the audience(boys and girls)in a matrix format. Separate values were given to boys and girls which are 1 and 0 respectively. The arrangement should be done based on one condition. She should arrange all the girls below the main diagonal since it is done in a matrix format. If she did the arrangement in a proper way she will win the prize or else not. Help the Judges to find out whether she wins the prize. If she wins you can print "Upper triangular matrix" or else "Not an Upper triangular matrix". Write a program to check whether the given matrix is an upper triangular matrix or not



Input Format

The input consists of the number of rows and columns and the matrix



Output Format

The output is any one of the following two strings Upper triangular matrix or Not an Upper triangular matrix.



Sample Input

3

0 0 1

0 2 3

0 0 5



Sample Output

Upper triangular matrix



Explanation

Since all the elements below the diagonal of the matrix are 0 it prints the Upper triangular matrix.*/
#include <stdio.h>
int main()
{
   int size;
  scanf("%d",&size);
  int arr[size][size];
  for(int i=0;i<size;i++){
    for(int j=0;j<size;j++){
      scanf("%d",&arr[i][j]);
    }
  }
  int check=1;
  for(int i=1;i<size;i++)
  {
    for(int j=0;j<i;j++)
    {
      if(arr[i][j]!=0)
      {
        check=0;
        break;
      }
    }
  }
  if(check)
  {
    printf("Upper triangular matrix");
  }else
  {
    printf("Not an Upper triangular matrix");
  }
   return 0;
}