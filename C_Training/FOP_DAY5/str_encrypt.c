/*A company transfers an encrypted code to one of its clients. The code needs to be decrypted so that it can be used for accessing all the required information. The code can be decrypted by interchanging each consecutive digit and once a digit has been interchanged then it cannot be used again. If at a certain point there is no digit to be interchanged with, then the single digit must be left as it is.

Write an algorithm to decrypt the code so that it can be used to access the required information.

Input Format

The first line of the input consists of an integer - encrypted code, representing the encrypted code given to the client.



Output Format

Print an integer representing the decrypted code that can be used for accessing the required information



Sample Input 0

39631



Sample Output 0

93361*/
#include <stdio.h>
int main()
{
  char num[1000];
  scanf("%s",num);
  for(int i=0;i<strlen(num);i+=2)
  {
    if(i+1<strlen(num))
    {
      char temp = num[i];
      num[i] = num[i+1];
      num[i+1] = temp;
    }
  }
  printf("%s\n",num);
   return 0;
}