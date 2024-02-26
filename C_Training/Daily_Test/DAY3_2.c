/*It’s your job to calculate the cost of replacing the damaged battle droids and to check whether it is within the budget limit of Rs.15000. The cost of the equipment and the parts are given below. Write a program to solve this problem. Blast Rifle Rs. 350.34 Visual Sensors Rs. 230.90 Auditory Sensors Rs. 190.55 Arms Rs. 125.30 Legs Rs. 180.90



Input Format:

Input consists of 5 integers.

The first input denotes the number of blast rifles to be replaced.

The second input denotes the number of visual sensors to be replaced.

The third input denotes the number of auditory sensors to be replaced.

The fourth input denotes the number of arms to be replaced.

The fifth input denotes the number of legs to be replaced.

Output Format:

If the total cost of replacing damaged battle droids is within the sanctioned budget of Rs. 15000, print "Yes". Otherwise, print "No".

Refer the sample output for formatting.



Sample Input 1:

20

10

14

3

9

Sample Output 1:

Yes

Explanation:

Here, the cost of the equipment is lesser than or equal to the budget amount and hence the output is "Yes".



Sample Input 2:

30

20

24

13

9

Sample Output 2:

No

Explanation:

Here, the cost of the equipment is greater than the budget amount and hence the output is "No".*/
#include <stdio.h>

int main() 
{
    int rifles, v_sensors, a_sensors, arms, legs;
    scanf("%d %d %d %d %d", &rifles, &v_sensors, &a_sensors, &arms, &legs);
    
    double total_cost = rifles*350.34 + v_sensors*230.90 + a_sensors*190.55 + arms*125.30 + legs*180.90;
    
    if(total_cost <= 15000) printf("Yes\n");
    else printf("No\n");
    
    return 0;
}
