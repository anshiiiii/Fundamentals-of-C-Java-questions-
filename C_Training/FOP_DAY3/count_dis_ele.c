/*Harish and Rajesh were developing a plan to find the ideal woman for Sheldon Cooper. There were puzzles, translations, and questions to check a person's intelligence. One such question was to come up with a program to count the number of distinct elements in an array. Harini is a postdoctoral researcher and a former graduate student of Caltech who is a huge fan of Sheldon's work and she wanted to impress Sheldon by writing a program to count the number of distinct element in an array. Can you help Harini?



Input Format

Input consists of 1 integer and 1 array. The first integer corresponds to the size of the array.



Output Format

The output prints the number of distinct element in an array.



Sample Input 0

5

1

2

3

3

4



Sample Output 0

There are 4 distinct element in the array.



Explanation

Since there are 4 distinct elements it will print There are 4 distinct element in the array.*/
#include <stdio.h>
int main()
{
  int n,a[20],count = 0;
  scanf("%d",&n);
  for(int i = 0 ;i < n;i++)
  {
    scanf("%d",&a[i]);
  }
  int seen[1000] = {0};  //using this to check whether we have visited the element of the array or not
  for(int i = 0;i<n;i++)
  {
    if(seen[a[i]] == 0)  //checking if the element is visited and recorded in the hash map
      count++;
    seen[a[i]] = 1;  //marking the visited element array as 1
  }
  printf("There are %d distinct element in the array.",count);
   return 0;
}