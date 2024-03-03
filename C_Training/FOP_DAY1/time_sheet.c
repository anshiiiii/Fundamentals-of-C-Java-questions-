/*John Watson just started to work as a programming trainer for Bart's Placement Cell. He is paid Rs.100 an hour, with a few exceptions. He earns an extra Rs.15 an hour for any part of a day where he works for more than 8 hours. Also, he earns a 25% bonus for working on Saturdays and a 50% bonus for working on Sundays. The bonuses for Saturday and Sunday are computed based on the hours worked on those days. You'll be given the number of hours John Watson worked on each day in a week (Sunday, Monday, ..., Saturday), and you need to compute his salary for the week.



Input Format

Input consists of 7 integers



Output Format

Print John's salary for a week.



Sample Input 1

0

8

8

8

10

6

0



Sample Output 1

4030

*/
#include <stdio.h>
int main()
{
   // Try out your code here
   int sun, mon, tue, wed, thu, fri, sat, rsun, rmon, rtue, rwed, rthu, rfri, rsat, bonus, salary;
   scanf("%d %d %d %d %d %d %d", &sun, &mon,&tue, &wed, &thu, &fri, &sat);
   rsun = sun * 150;
   rsat = sat * 125;
   if(mon<=8)
   {
     rmon = mon * 100;
   }
   else	
   {
     bonus = mon - 8;
     rmon = (8 * 100) + (bonus * 115);
   }
   if(tue<=8)
   {
     rtue = tue * 100;
   }
   else	
   {
     bonus = tue - 8;
     rtue = (8 * 100) + (bonus * 115);
   }
  if(wed<=8)
   {
     rwed = wed * 100;
   }
   else	
   {
     bonus = wed - 8;
     rwed = (8 * 100) + (bonus * 115);
   }
  if(thu<=8)
   {
     rthu = thu * 100;
   }
   else	
   {
     bonus = thu - 8;
     rthu = (8 * 100) + (bonus * 115);
   }
   if(fri<=8)
   {
     rfri = fri * 100;
   }
   else	
   {
     bonus = fri - 8;
     rfri = (8 * 100) + (bonus * 115);
   }
   salary = (rsun + rmon + rtue + rwed + rthu + rfri + rsat);
   printf("%d",salary);
   return 0;
}

//simpler java program using array,loops and condtions
// import java.util.Scanner;

// public class JohnWatsonSalary {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Read input hours for each day
//         int[] hoursWorked = new int[7];
//         for (int i = 0; i < 7; i++) {
//             hoursWorked[i] = scanner.nextInt();
//         }

//         // Calculate total hours worked
//         int totalHours = 0;
//         for (int i = 0; i < 7; i++) {
//             totalHours += hoursWorked[i];
//         }

//         // Calculate salary
//         int baseSalary = totalHours * 100;
//         int extraPay = 0;
//         for (int i = 0; i < 7; i++) {
//             if (hoursWorked[i] > 8) {
//                 extraPay += (hoursWorked[i] - 8) * 15;
//             }
//         }

//         // Calculate bonus for Saturday and Sunday
//         int saturdayHours = hoursWorked[5];
//         int sundayHours = hoursWorked[6];
//         int saturdayBonus = (int) (saturdayHours * 0.25 * 100);
//         int sundayBonus = (int) (sundayHours * 0.5 * 100);

//         // Total salary
//         int totalSalary = baseSalary + extraPay + saturdayBonus + sundayBonus;

//         // Print the result
//         System.out.println(totalSalary);
//     }
// }
