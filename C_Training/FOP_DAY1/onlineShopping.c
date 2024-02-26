/*Richard Castle wants to buy a shirt. As he is very lazy, he decided to buy the shirt online. He chooses a shirt on Flipkart and is surprised to see the same shirt on Snapdeal, and Amazon as well. So he decided to buy the shirt from the website which offers the least price. The price of the shirt, the discount percentage, and the shipping charges of all three websites have been given as input. Help him in calculating the price of the shirt on each website and decide which website has the lowest price.If the price in all the three websites are same then first priority goes to Flipkart, then Snapdeal and finally Amazon.



Input Format

Input consists of 9 integers. The first three input corresponds to Flipkart details such as the price of the shirt, discount offered, and shipping charges. The next three input corresponds to Snapdeal details such as the price of the shirt, discount offered, and shipping charge. The last three input corresponds to Amazon details such as the price of the shirt, discount offered, and shipping charge.



Output Format

The Output consists of three integers that denote the prices on Flipkart, Snapdeal, and Amazon and should suggest the website that has the lowest price.



Sample Input

1000

50

50

900

50

70

800

10

200



Sample Output

In Flipkart: Rs.550

In Snapdeal: Rs.520

In Amazon: Rs.920

Choose Snapdeal

*/
#include <stdio.h>
int main()
{
  int flip_p,flip_dis,flip_ship,snap_p,snap_dis,snap_ship,ama_p,ama_dis,ama_ship;
  int flip_tot,snap_tot,ama_tot;
  scanf("%d %d %d %d %d %d %d %d %d",&flip_p,&flip_dis,&flip_ship,&snap_p,&snap_dis,&snap_ship,&ama_p,&ama_dis,&ama_ship);
  flip_tot = flip_p - (flip_p * flip_dis / 100) + flip_ship;
  snap_tot = snap_p - (snap_p * snap_dis / 100) + snap_ship;
  ama_tot = ama_p - (ama_p * ama_dis / 100) + ama_ship;
  printf("In Flipkart: Rs.%d\n", flip_tot);
  printf("In Snapdeal: Rs.%d\n", snap_tot);
  printf("In Amazon: Rs.%d\n", ama_tot);
  if(flip_tot <= snap_tot && flip_tot <= ama_tot)
  {
    printf("Choose Flipkart");
  }
  else if(snap_tot <= flip_tot && snap_tot <= ama_tot)
  {
    printf("Choose Snapdeal");
  }
  else
  {
    printf("Choose Amazon");
  }
   return 0;
}