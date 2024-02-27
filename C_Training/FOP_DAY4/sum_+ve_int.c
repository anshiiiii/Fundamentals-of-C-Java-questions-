/*Write a program to find the sum of the positive odd numbers present in an array using recursion.



Input Format

The first integer input represents the size of the array (n), next n lines consist of values present in the array.



Output Format

The output prints the sum of positive odd numbers in an array. Refer to the sample output for formatting specifications.



Sample Input 1

3

1

1

1



Sample Output 1

Sum = 3*/
#include <stdio.h>

int sumOdd(int arr[], int n) {
    if (n <= 0)
        return 0;
    else if (arr[n - 1] % 2 != 0)
        return arr[n - 1] + sumOdd(arr, n - 1);
    else
        return sumOdd(arr, n - 1);
}

int main() {
    int n;
    scanf("%d", &n);
    int arr[n];
    for(int i = 0; i < n; i++)
        scanf("%d", &arr[i]);
    printf("Sum = %d", sumOdd(arr, n));
    return 0;
}
