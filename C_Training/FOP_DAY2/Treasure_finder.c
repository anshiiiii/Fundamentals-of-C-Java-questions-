/*Nikitha and Danny are close friends. They both are studying in the same school. Now they are on summer vacation. As they are bored, they ask their parents to take them to an exhibition. Nikitha and Danny play a game. In this game, there are three boxes with some number written on top. There is a treasure in one of the three boxes and it is present in the box with the second largest number on top. Also, to open the box, they need to decode the correct code of this box. The clue given to them to find the code is that it is the largest number that divides all three given numbers. So, now help Nikitha and Danny to decode the code.



Input Format

Input consists of three integers. The first input corresponds to the number of the first box. The second input corresponds to the number of the second box. The third input corresponds to the number of the third box.



Output Format

Refer to the sample output.



Sample Input 1

2

4

6



Sample Output 1

The treasure is in the box which has the number 4

The code to open the box is 2

*/
#include <stdio.h>

int main() {
    int l,m,n;

    scanf("%d %d %d", &l, &m, &n);

    int second_largest = l;
    if (m >= l && m <= n || m <= l && m >= n) {
        second_largest = m;
    } else if (n >= l && n <= m || n <= l && n >= m) {
        second_largest = n;
    }

    int largest_divisor = 1;

    for (int i = 1; i <= l && i <= m && i <= n; i++) {
        if (l % i == 0 && m % i == 0 && n % i == 0) {
            largest_divisor = i;
        }
    }

    printf("The treasure is in the box which has the number %d\n", second_largest);
    printf("The code to open the box is %d\n", largest_divisor);

    return 0;
}
