/*Write a program to count the number of vowels in the given string.



Input Format

Input consists of 1 string.



Output Format

Output print the number of Vowels.



Sample Input 0

face 



Sample Output 0

Number of vowels: 2 

*/
#include <stdio.h>
#include <string.h>

int main() {
    char str[100];
    int count = 0;
    scanf("%s", str);

    for(int i = 0; str[i]!='\0'; ++i) {
        if(str[i]=='a' || str[i]=='e' || str[i]=='i' ||
           str[i]=='o' || str[i]=='u' || str[i]=='A' ||
           str[i]=='E' || str[i]=='I' || str[i]=='O' ||
           str[i]=='U') {
            count++;
        }
    }

    printf("Number of vowels: %d\n", count);

    return 0;
}
