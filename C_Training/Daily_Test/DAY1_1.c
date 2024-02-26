#include <stdio.h>
int main()
{
  int r1,r2,r3,n;
  scanf("%d%d%d%d",&r1,&r2,&r3,&n);
  if(r1%n==0)
  {
     printf("Car 1 goes into road A");
  }
  else if(r2%n==0)
  {
     printf("Car 1 goes into road B");
  }
  else if(r3%n==0)
  {
     printf("Car 1 goes into road C");
  }
  else
  {
     printf("No path exists");
  }

}