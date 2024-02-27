/*Write the program to reverse each word of a string.



Input Format

Input consists of one string



Output Format

The output consists of one string (reverse of the input string)



Sample Input 0

Hello World



Sample Output 0

﻿World Hello

*/
#include<stdio.h>
#include<string.h>
void reverseSentence(char A[])
{
    int len=strlen(A);
    int count=0;
    for(int i=len-1;i>=0;i--)
    {
        
        if(A[i]!=' ')
        {
            count++;
        }
         
        else
        {
           
            for(int j=i+1;j<=(i+count);j++)
            {
                printf("%c",A[j]);
            }
            count=0;
            printf(" ");
        }
    }
    for(int i=0;i<count;i++)
    {
        printf("%c",A[i]);
    }
}
int main() 
{
    char A[100];
    scanf("%[^\n]s",A);
    int len = strlen(A);
  
    reverseSentence(A);
    return 0;
}    