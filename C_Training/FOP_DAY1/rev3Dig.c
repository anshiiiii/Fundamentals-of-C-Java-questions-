#include <stdio.h>
int main()
{
  int n,temp,sum,l1,l2,mid,l3;
  scanf("%d", &n);
  temp = n;
  l1 = temp%10;
  mid = temp/10;
  l2 = mid%10;
  l3 = temp/100;
  sum = (l1 * 100) + (l2 *10) + (l3*1);
  printf("%d",sum);
   return 0;
}