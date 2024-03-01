/*Write a C program to return the nearest 10 multiple of any given number.

Input Format:

Input consist of integer

1<=n<=1000000

Output Format:

Output consist of integer .

Sample Input:

6

Sample Output:

10*/
#include<stdio.h>
int main()
{
 int n;
 scanf("%d",&n);
 if(n<10){
 printf("%d",10);
 return 0;
 }
 if(n%10>=5)printf("%d",n-(n%10)+10);
 else printf("%d",n-(n%10));
}