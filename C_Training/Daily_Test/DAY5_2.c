/*Write a C program to decode the given string.

Input Format:

Input consists of String

Output Format:

Output consists ofString

Sample Input:

i2n3s4t3a2

Sample Output:

iinnnsssstttaa*/
#include <stdio.h>
#include <ctype.h> 

void decodeString(const char* str) {
    for (int i = 0; str[i] != '\0'; ++i) {
        if (isdigit(str[i])) {
            int count = str[i] - '0'; 
           
            for (int j = 0; j < count; ++j) {
                putchar(str[i - 1]);
            }
        }
    }
}

int main() {
    char input[100]; 
  
    scanf("%s", input);
 
    decodeString(input);
    printf("\n");

    return 0;
}
