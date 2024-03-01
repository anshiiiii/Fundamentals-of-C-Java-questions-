/*Write a C program to rotate matrix by 90 degree.

Input Format:

The First line corresponds to rows size.

The second line corresponds to column size.

The third line corresponds to the rotation of matrix (if flag is 1, it rotates to right. If it is 0 then rotates in left direction).

The remaining corresponds to the elements of the matrix

Output Format:

Displays the rotated matrix by 90 degree.

Sample Input:

3

3

1

1

2

3

4

5

6

7

8

9

Sample Output:

7 4 1

8 5 2

9 6 3*/
#include<stdio.h>
int main()
{
 int n,m,r;
 scanf("%d %d %d",&n,&m,&r);
 int a[n][m];
 for(int i=0;i<n;i++){
 for(int j=0;j<m;j++){
 scanf("%d",&a[i][j]);
 }
 }
 if(r==0){
 for(int j=m-1;j>=0;j--){
 for(int i=0;i<n;i++){
 printf("%d ",a[i][j]);
}
 printf("\n");
 }

 }
 else{
 for(int i=0;i<n;i++){
 for(int j=m-1;j>=0;j--){
 printf("%d ",a[j][i]);
 }
 printf("\n");
 }

 }
}