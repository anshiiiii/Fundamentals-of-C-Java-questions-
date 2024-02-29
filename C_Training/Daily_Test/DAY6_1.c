/*Write a c program to find the maximum sum increasing sub_sequence in the given array.

Input Format:

Input consist of integers

1st Input => Size of the array

2nd Input => number of array elements

Output Format:

Output is an Integer

Sample Input:

5

5 50 10 20 30

Sample Output:

60

Description:

Here Increasing sub-sequence are

5 50

10 20 30

5+50= 55

10+20+30=60. So 60 is greater than 55.*/
#include <stdio.h>

int max_inc(int a[], int n) 
{
    int max = a[0], prev = a[0], current = a[0];
    for (int i = 1; i < n; i++) 
    {
        int currVal = a[i];
        if (currVal > prev) 
        {
            current += currVal;
            if (current > max)
                max = current;
        } 
        else 
        {
            current = currVal;
        }
        prev = currVal;
    }
    return max;
}

int main() 
{
    int n;
    scanf("%d", &n);
    int a[n];
    for (int i = 0; i < n; i++)
        scanf("%d", &a[i]);
    printf("%d\n", max_inc(a, n));
    return 0;
}