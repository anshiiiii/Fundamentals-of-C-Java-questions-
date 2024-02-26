/*Kailash and his daughter Keerthana were arguing about who is the smartest person in the family. Kailash who is a world-known Computer Engineer asked Keerthana who has not yet completed college to write a program to sort the given array in ascending order. Can you help Keerthana?



Input Format

Input consists of 1 integer and 1 array. The integer corresponds to the size of the array.



Output Format

The output consists of an array of elements after sorting.



Sample Input 0

5

54

68

25

14

74



Sample Output 0

The Sorted array is:

14

25

54

68

74*/
#include <stdio.h>
int main()
{
  int n,arr[100],temp;
  scanf("%d",&n);
  for(int i = 0;i < n; i++)
  {
    scanf("%d",&arr[i]);
  }
  for (int i = 0; i < n - 1; i++) 
  {
        for (int j = 0; j < n - i - 1; j++) 
        {
            if (arr[j] > arr[j + 1]) 
            {
    
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
  printf("The Sorted array is:\n");
  for(int i = 0;i<n;i++)
  {
   printf("%d\n",arr[i]);
  }
  
   return 0;
}