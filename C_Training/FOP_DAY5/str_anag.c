/*Write a program to find whether the given string is the anagram of the first string.

Note: An anagram of a string is another string that contains the same characters, only the order of characters can be different.
Input Format

The input consists of two strings.



Output Format

The output Print "Anagram", if strings are Anagram otherwise print "Not Anagram"



Sample Input 0

eat

ate



Sample Output 0

Anagram*/
#include <stdio.h>
void fun(char a[])
{
  for(int i=0;i<strlen(a);i++)
  {
    for(int j=i+1;j<strlen(a);j++)      //soritng the strings and comparing them in the main function
    {
    	if(a[i]>a[j])
        {
          char t=a[i];
          a[i]=a[j];
          a[j]=t;
        }
    }
  }
}
int main()
{
   char a[10];
  char b[10];
  scanf("%s%s",&a,&b);
  fun(a);
  fun(b);
  int f=0;
  for(int i=0;i<strlen(a);i++)
  {
    if(a[i]!=b[i])
    {
      f=1;
      break;
    }
  }
  if(f==0)
    printf("Anagram");
  else
    printf("Not Anagram");
   return 0;
}