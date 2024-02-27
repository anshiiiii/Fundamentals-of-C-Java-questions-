/*An online test was conducted for the students for taking up a new course. In the test, the students will be provided with two words. They need to remove the characters in the second word which is present in the first word and have to type the rest. Write a program to remove all characters in the second string which are present in the first string



Input Format

Input consists of two strings.



Output Format

The output consists of one string.



Sample Input 0

Motor

Motorcycle



Sample Output 0

cycle



Explanation

﻿The characters which are not present in the first string but present in the second string are a cycle and hence the output is cycle.

*/
#include <stdio.h>

int main() {
    char str1[100], str2[100];
    int i, j, k;

    scanf("%s", str1);

    scanf("%s", str2);

    for(i = 0; str1[i] != '\0'; ++i) 
    {
        for(j = 0; str2[j] != '\0'; ++j) 
        {
            if(str1[i] == str2[j]) 
            {
                // Shift characters to the left
                for(k = j; str2[k] != '\0'; ++k)
                {
                    str2[k] = str2[k + 1];
                }
                j--;  //as the elemnts are shifted to left and the array size decreases
            }
        }
    }

    printf("%s\n", str2);

    return 0;
}
