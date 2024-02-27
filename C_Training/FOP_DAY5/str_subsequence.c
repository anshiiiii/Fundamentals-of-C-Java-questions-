/*Given two strings s and t, return 1 if s is a subsequence of t, or 0 otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "abe" is a subsequence of "abcde" while "aed" is not).

Input Format

Two strings t and s in order.



Output Format

A single integer(1 or 0)



Sample Input 0

abcde

abe



Sample Output 0

﻿1

*/
#include <stdio.h>
int main()
{
  char w1[50],w2[50];
  scanf("%s%s",w1,w2);
  int count = 0,j = 0;
  for(int i=0;(i<strlen(w1) && j<strlen(w2));i++)
  {
    if(w1[i] == w2[j])
    {
      count++;
      j++;
    }
  }
  if(strlen(w2) == count)
    printf("1");
  else
    printf("0");
  
   return 0;
}