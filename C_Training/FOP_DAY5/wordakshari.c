/*Antakshari is a popular parlor game played in India. Many word games are similar to antakshari. One such game is wordakshari. The game can be played by two or more people. The first player has to recite a word. The last letter of the word is then used by the next player to recite another word starting with that letter. The winner or winning team is decided by a process of elimination. The person or the team that cannot come up with a word with the right consonant is eliminated. - The following rules need to be followed while playing this game. - (i) All other words except the first word have to begin with the last letter of the previous word - (ii) No words can be repeated. write a program to print the wordakshari chain.



Input Format

Input consists of n+1 lines.
The first n lines contain strings corresponding to the words in the chain.
The last line of input contains the string #### to mark the end of the input.


Output Format

The output consists of the valid wordakshari chain.



Sample Input 0

oracle

error

rohit

####



Sample Output 0

oracle

error

rohit



Explanation

﻿In oracle the last letter is e and so the next word will be error since it starts with e and it goes on like that and hence the output is



- oracle

- error

- rohit*/
#include<stdio.h>
#include<string.h>
int main()
{
 char a[100],b[1000] = "",c[] = "####";
  do
  {
    fgets(a,sizeof(a),stdin);
    a[strcspn(a,"\n")] = '\0';
    if(b[0] == '\0' || a[0] == b[strlen(b)-1])
    {
      printf("%s\n",a);
    }
    strcpy(b,a);
  }while(strcmp(a,c) != 0);
  return 0;
}