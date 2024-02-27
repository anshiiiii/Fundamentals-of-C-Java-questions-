/*Write a program to find the maximum element in an array using recursion.



Input Format

Input consists of the size of the array and array elements



Output Format

The output prints the maximum element in an array. Refer sample input and output for formatting specifications.




Input (stdin)
6
2
5
1
7
4
2

Output (stdout)
Maximum element in the array is 7*/
#include <stdio.h>

int findMax(int arr[], int n) {
    if (n == 1)
        return arr[0];
    else
        return (arr[n - 1] > findMax(arr, n - 1)) ? arr[n - 1] : findMax(arr, n - 1);
}

int main() {
    int n;
    scanf("%d", &n);
    int arr[n];
    for(int i = 0; i < n; i++)
        scanf("%d", &arr[i]);
    printf("Maximum element in the array is %d", findMax(arr, n));
    return 0;
}
