/*Write a C program to convert a string to an floting point number.



Input consists of a single floating point embedded between alpha characters. Remove all non digits and convert the resulting string to floating-point number and print 2 * n.



Sample Input:

aes2sea2.A33x

Sample Output:

44.660000*/
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h> 


double extractFloat(const char* str) {
    char numericStr[100]; 
    int j = 0;

    for (int i = 0; str[i] != '\0'; ++i) {
        if (isdigit(str[i]) || str[i] == '.' || str[i] == '-') {
            numericStr[j++] = str[i];
        }
    }
    numericStr[j] = '\0';

    return atof(numericStr); 
}

int main() {
    char input[100];
    scanf("%s", input); 

    double result = extractFloat(input);

    printf("%.6f\n", result * 2);
    return 0;
}
