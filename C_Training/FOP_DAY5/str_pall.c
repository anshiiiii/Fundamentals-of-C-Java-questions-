/*Write a program to find whether the given string is a palindrome or not without using string library functions.

Note: The string reads the same backward and forward.



Input Format

Input consists of 1 string.



Output Format

If the given string is a Palindrome display “Palindrome”, else display “Not a Palindrome”.



Sample Input 0

mam



Sample Output 0

Palindrome*/
#include <stdio.h>
#include <stdbool.h>

int main() {
    char original[100];
    char reversed[100];

 
    scanf("%s", original);

    // Calculate the length of the original string
    int length = 0;
    while (original[length] != '\0') 
    {
        length++;
    }

    // Reverse the original string
    int i, j;
    for (i = length - 1, j = 0; i >= 0; i--, j++) 
    {
        reversed[j] = original[i];
    }
    reversed[j] = '\0'; // Add null terminator to the reversed string

    // Compare original and reversed strings to check for palindrome
    bool isPalindrome = true;
    for (i = 0; i < length; i++) 
    {
        if (original[i] != reversed[i]) 
        {
            isPalindrome = false;
            break;
        }
    }

    // Print whether it's a palindrome or not
    if (isPalindrome) 
    {
        printf("Palindrome\n");
    } else 
    {
        printf("Not a Palindrome\n");
    }

    return 0;
}
