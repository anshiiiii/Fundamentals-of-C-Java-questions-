/*Praveen is crazy about IPL. He was watching Mumbai Indians vs. Chennai Super Kings final match. Mumbai won the toss and elected to bat first. They finished batting with a score of X. Next, Chennai started to bat and scored Y runs in N number of balls. Now, Praveen wants to calculate the run rate and check whether there is a probability for Chennai to win or not. Help him calculate the run rate and check the probability.



Input Format

Input consists of 4 integers. The first input corresponds to the total number of balls. The second input corresponds to the total number of runs. The third input corresponds to the number of runs scored. The fourth input corresponds to the number of balls bowled.



Output Format

The first output corresponds to the total number of overs. The second output corresponds to the total number of overs finished. The third output corresponds to the current run rate. The fourth output corresponds to the total run rate. The fifth output corresponds to the eligibility. If eligible print "Eligible to Win" else print "Not Eligible to Win"



Sample Input 1

300

375

78

45



Sample Output 1

50

7.3

10.7

7.5

Eligible to Win

*/
#include <stdio.h>
int main()
{
   int tb,tr,rs,bb,z1,z2,zz;
    scanf("%d%d%d%d",&tb,&tr,&rs,&bb);
    zz=tb/6;
    z1=bb/6;
    z2=bb%6;
    float z3=z1+z2*.1; //overs with decimal value
    float z4=rs/z3; //current run rate
    float ans=(float)tr/zz; //total run rate
    printf("%d\n",zz);
    printf("%.1f\n",z3);
    printf("%.1f\n",z4);
    printf("%.1f\n",ans);
    if(z4>ans)
        printf("Eligible to Win");
    else
        printf("Not Eligible to Win");
    return 0;
}