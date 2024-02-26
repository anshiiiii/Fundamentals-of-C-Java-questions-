/*Jack and John were investigating a murder and the murderer was Ms.Isha Adler. She wanted Jack to find her by solving the puzzles. Jack was able to solve all but one. The last task was to write a program to remove duplicate elements from an array. Can you help Jack?



Input Format

Input consists of 1 integer and 1 array. The first integer corresponds to the size of the array. The next integers correspond to the elements in the array.



Output Format

The output consists of an array with no duplicate elements.



Sample Input

5

1

2

2

3

4



Sample Output

1

2

3

4*/
#include <stdio.h>
int main()
{
  int n,arr[100],b[100];
  scanf("%d",&n);
  for(int i = 0;i < n;i++)                 //test case 1 2 2 3 4
  {
    scanf("%d",&arr[i]);

  }
  int seen[1000] = {0};
  for(int i = 0; i < n; i++) 
  {
      if(seen[arr[i]] == 0)
      {
        printf("%d\n",arr[i]);
      }
      seen[arr[i]] = 1;
  }
   return 0;
}