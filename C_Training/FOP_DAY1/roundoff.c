#include <stdio.h>
#include <math.h>
int main()
{
  float a;
  int c,f;
  scanf("%f",&a);
  c = (int)ceil(a);
  f = (int)floor(a);
  printf("%d\n%d\n%d",f,c,f);
   return 0;
}