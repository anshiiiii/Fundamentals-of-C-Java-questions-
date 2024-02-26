/*A bus stop queue has 'n' groups of people. The i-th group from the beginning has 'ai' people. Every 30 minutes an empty bus arrives at the bus stop, it can carry atmost 'm' people. Naturally, the people from the first group enter the bus first. Then goes the people from the second group and so on. Note that the order of groups in the queue never changes. Moreover, if some group cannot fit all of its members into the current bus, it waits for the next bus and joins with the other groups standing after them in the queue. Your task is to determine the number of buses needed to transport all 'n' groups to the Jeju Island countryside.



Input Format

The first line contains two integers n and m (1 ≤ n, m ≤ 100). The next line contains n integers: a1, a2, ..., an (1 ≤ ai ≤ m).



Output Format

Print a single integer — the number of buses needed to transport all n groups to the Jeju Island countryside.



Sample Input 0

4 3

2 3 2 1



Sample Output 0

3*/
#include <stdio.h>
int main()
{
  int n,m;
  scanf("%d %d",&n,&m);
  int a[100],sum = 0,buses = 0;
  for(int i = 0;i < n;i++)
  {
    scanf("%d",&a[i]);             //for test case   4 3
    if(sum + a[i] > m)                          //   2,3,2,1
    {
      buses++;
      sum = a[i];    //passes for a[1],a[2] so buses == 2
    }
    else
    {
      sum = sum + a[i]; //passes for a[0],a[3] so sum = 3 for last iteration
    }
  }
  if(sum>0)
    buses++;         //sum == 3 from last iteration in else so buses == 3
  printf("%d\n",buses);
  
   return 0;
}