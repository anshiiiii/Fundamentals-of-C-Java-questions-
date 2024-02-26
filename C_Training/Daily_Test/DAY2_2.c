/*You are given a string str as input. Determine whether any anagram of str is a palindrome or not.



Note:

• The string str will contain only lowercase English alphabets.



Input format:

The input consists of a single line.

• The line contains the string str.

Input will be read from the STDIN by the candidate.



Output format:

A single integer, i.e. 1 or 0.



The output will be matched to the candidate's output printed on the STDOUT.

Constraints:

• 0 < number of characters in string str < 15000



Example:

Input:

cdcdcdcdeeeef

Output:

1

Explanation:

The output is 1 since "cdcdeefeedcdc", an anagram of the original string is a palindrome.



Sample Input:

aaaaabb

Sample Output:

1 */
#include <stdio.h>

int main() {
    char str[15000];
    int count[26] = {0}, i;

    printf("Enter a string: ");
    scanf("%s", str);

   
    for(i = 0; str[i] != '\0'; ++i) {
        count[str[i]-'a']++;
    }

    int oddCount = 0;
    for(i = 0; i < 26; ++i) {
        if(count[i] % 2 != 0) {
            oddCount++;
        }
    }

    
    if(oddCount > 1) {
        printf("0\n");
    } else {
        printf("1\n");
    }

    return 0;
}
