package Java_Training.DecisionMaking;

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

4030*/


import java.util.*;

public class Time_sheet
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int sun, mon, tue, wed, thu, fri, sat, rsun, rmon, rtue, rwed, rthu, rfri, rsat, bonus, salary;
    sun = s.nextInt();
    mon = s.nextInt();
    tue = s.nextInt();
    wed = s.nextInt();
    thu = s.nextInt();
    fri = s.nextInt();
    sat = s.nextInt();
    rsun = sun*150;
    rsat = sat*125;
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
   System.out.printf("%d",salary);
    s.close();
  }
}