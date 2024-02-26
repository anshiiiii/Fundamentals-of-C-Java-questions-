/*Jon Snow and the men in the north decided to open Castle Black for the northerners and the Castle was turned into a Hotel. The Hotel was flourishing and there was high demand for the rooms. So Jon Snow decided to modify the tariff accordingly. Write a program to calculate the hotel tariff. The room rent is 20% high during peak seasons [April-June and November-December].



Input Format

The first input integer denotes the count of the month. The second input integer denotes the room rent per day. The third input integer denotes the number of days stayed in the hotel.



Output Format

Print the hotel tariff to be paid. (Note: if the month value entered is not ranging from 1-12, print as Invalid Input)



Sample Input 

3

1500

2



Sample Output

3000 

*/
#include <stdio.h>
int main()
{
  int month,rent,days,total;
  scanf("%d %d %d", &month,&rent,&days);
  if(month >= 1 && month <= 12)
  {
    if((month >= 4 && month <= 6) || (month >= 11 && month <= 12))
    {
      total = rent*days + (rent * days * 0.2);
      printf("%d",total);
    }
    else
    {
      total = rent*days;
      printf("%d",total);
    }
  }
  else
  {
    printf("Invalid Input");
  }
   return 0;
}