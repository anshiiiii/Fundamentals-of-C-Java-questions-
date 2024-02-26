/*In the city of Toyland, there are N houses. Noddy is looking for a piece of land in the city to build his house. All the houses in the city lie in a straight line and all of them are given a house number and position of the house from the entry point of the city. Noddy wants to find the house numbers between which he can build the largest house. Write an algorithm to help Noddy to find the house numbers between which he can build his house.

Hint: No two houses will have the same position in case of multiple such answers, print the one with the least distance from the reference point.



Input Format

The first line of the input consists of an integer num, representing the number of houses (N). The next N lines consist of two space-separated integers – house Num and pos, representing the house number and the position of the houses.



Constraints

2 < num < 10^6
1 < house Num < num
0 < pos < 10^6


Output Format

Print two space-separated integers representing the house numbers in ascending order between which the largest plot is available.



Sample Input

5

3 7

1 9

2 0

5 15

4 30



Sample Output

4 5

*/
#include <stdio.h>
#include <stdlib.h>

int main() {
    int num, i, j, maxGap = 0, house1, house2;
    scanf("%d", &num);
    int houseNum[num], pos[num], temp;
    for(i = 0; i < num; i++) {
        scanf("%d %d", &houseNum[i], &pos[i]);
    }
    // Bubble sort based on positions
    for(i = 0; i < num-1; i++) {
        for(j = 0; j < num-i-1; j++) {
            if(pos[j] > pos[j+1]) {
                temp = pos[j];
                pos[j] = pos[j+1];
                pos[j+1] = temp;
                temp = houseNum[j];
                houseNum[j] = houseNum[j+1];
                houseNum[j+1] = temp;
            }
        }
    }
    // Find the maximum gap
    for(i = 0; i < num-1; i++) {
        if(pos[i+1] - pos[i] > maxGap) {
            maxGap = pos[i+1] - pos[i];
            house1 = houseNum[i];
            house2 = houseNum[i+1];
        }
    }
    // Print the house numbers in ascending order
    if(house1 < house2)
        printf("%d %d\n", house1, house2);
    else
        printf("%d %d\n", house2, house1);
    return 0;
}
