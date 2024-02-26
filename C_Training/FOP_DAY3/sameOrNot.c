/*The Modern World Cinderella was happy to meet Prince Charming at the ballroom and she danced with him happily. While she was dancing, Prince wanted to check whether Cinderella is a perfect match for him. He asked her a question to check her knowledge of Arrays. Can you help Cinderella to write a program to find whether the two arrays are the same or not?

Note: Two arrays are said to be the same if the sum of both arrays is the same and the size of the arrays is the same.



Input Format

Input consists of 2 integers and 2 arrays. The integers should correspond to the size of the arrays.



Output Format

If two arrays are the same, display "Same" else display "Not Same"



Sample Input 0

4

4

1

2

3

4

1

2

3

4



Sample Output 0

Same

*/
#include <stdio.h>
int main()
{
  int n1,n2,a[100],b[100],sum1=0,sum2=0;
  scanf("%d %d",&n1,&n2);
  for(int i = 0;i < n1;i++)
  {
    scanf("%d",&a[i]);
    sum1 = sum1 + a[i];
  }
  for(int i = 0;i< n2;i++)
  {
    scanf("%d",&b[i]);
    sum2 = sum2 + b[i];
  }
  
 if(n1 == n2 && sum1 == sum2)
 {
    printf("Same");
 }
  else
  {
     printf("Not Same");
  }
   return 0;
}