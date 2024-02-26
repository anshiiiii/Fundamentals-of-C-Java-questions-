/*Write a program to generate the following series 0,2,8,14,...,34.



Input Format

The input is an integer that denotes 'n'.



Output Format

Print the series and refer to the sample output for formatting.



Sample Input 1

10



Sample Output 1

0 2 8 14 24 34 48 62 80 98

*/
#include <stdio.h>
#include <math.h>

int main() {
    int n, i, pr;
    scanf("%d", &n);

    for (i = 1; i <= n; i++) 
    {
        pr = 0;
        if (i % 2 == 0) 
        {
            pr = pow(i, 2) - 2;     
            printf("%d ", pr);  
        } 
      else 
        {
            pr = pow(i, 2) - 1;
            printf("%d ", pr);
        }
    }

    return 0;
}
