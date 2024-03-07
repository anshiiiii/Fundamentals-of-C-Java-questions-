package Java_Training.DecisionMaking;

/*The Government of India has decided to provide scholarships for Engineering students. The following are the eligibility criteria. Students passing out on or after 2021 are eligible. Standing arrears shall be maximum of 2. Family Income should be less than or equal to 200000 annually. Students' age should be greater than or equal to 18 and less than 21. The score on the scholarship test should be greater than or equal to 60%. Attendance percentage to date should be greater than or equal to 80%. There are some relaxations provided by the government for the above-mentioned criteria.

If the student has more than 2 standing arrears he/she should score 80% of marks in the scholarship test and attendance should be greater than or equal to 90% to date. If the family income is greater than 200000 but less than 250000 half the scholarship amount will be granted if he/she satisfies all the other criteria.

Write a program to tell the eligibility of the students for the scholarship by providing "Eligible", "Not Eligible", "Partially Eligible"



Input Format

The first is an Integer denoting age. The second is an Integer denoting the year of passing. The third is an Integer denoting family income. The fourth is an Integer input denoting standing arrears. The fifth is a float denoting the percentage of marks obtained in the scholarship test. The sixth is a float denoting attendance percentage.



Output Format

A string telling the eligibility as mentioned above.



Sample Input 1

19

2022

190000

0

100

100



Sample Output 1

Eligible*/

import java.util.*;

public class Scholarship
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int age,year,income,bl,marks,att;
 	age = s.nextInt();
    year = s.nextInt();
    income = s.nextInt();
    bl = s.nextInt();
    marks = s.nextInt();
    att = s.nextInt();
  if((age>=18 && age<21) && (year>=2021) && (income<=200000) && (bl<=2) && (marks>=60) && (att>=80))
  {
    System.out.println("Eligible");
  }
  else if((age>=18 && age<21) && (year>=2021) && (income>=200000 && income<250000) && (bl>2) && (marks>80) && (att>=90))
  {
    System.out.println("Partially Eligible");
  }
  else
  {
    System.out.println("Not Eligible");
  }
    s.close();
  }
}