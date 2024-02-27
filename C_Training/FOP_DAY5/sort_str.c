/*Write a program to sort a string in ascending order. Note: Do not use inbuilt functions.



Input Format

The input consists of the string s in a single line.



Output Format

Display the sorted string in ascending order.



Sample Input 0

faceprep



Sample Output 0

﻿aceefppr

*/
#include <stdio.h>

int main() {
    char str[100], temp;
    int i, j, len;

    scanf("%s", str);

  
    for(len = 0; str[len] != '\0'; ++len); //length of str

    // Sort the string
    for(i = 0; i < len-1; ++i) {
        for(j = i+1; j < len; ++j) {
            if(str[i] > str[j]) {
                temp = str[i];
                str[i] = str[j];
                str[j] = temp;
            }
        }
    }

    printf("%s\n", str);

    return 0;
}
