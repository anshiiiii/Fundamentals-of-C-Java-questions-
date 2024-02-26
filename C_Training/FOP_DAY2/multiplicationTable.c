#include <stdio.h>
int main()
{
  int n,t;
  scanf("%d %d",&n,&t);
  printf("Enter n\n");
  printf("Enter m\n");
  printf("The multiplication table of %d is\n",n);
  for(int i=1;i<=t;i++)
  {
    printf("%d*%d=%d\n",i,n,i*n);
  }
    
   return 0;
}