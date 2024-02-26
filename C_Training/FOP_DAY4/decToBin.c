//Write a program to convert a decimal number to a binary number by recursion.

#include <stdio.h>
void decToBin(int a)
{
  if(a == 0)
    return;
  decToBin(a/2);
  printf("%d",a%2);
}
int main()
{
  int n;
  scanf("%d",&n);
  decToBin(n);
   return 0;
}