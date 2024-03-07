package Java_Training.DecisionMaking;

/*The given are two positive integers Year and Month, the task is to find the number of days corresponding to each month of the given year where 1 is January, 2 is February, 3 is March, and so on.

Note: The Input range of year: Minimum Year = 1900 and Maximum Year = 9999 i.e (1900<=Year<=9999). The Input range of month: Minimum Month = 12 and Maximum Year = 12 i.e (1<=month<=12) If the given year does not lie between the given range, output 0.



Input Format

The input consists of two lines. The first line contains an integer, which is the Year. The second line contains an integer, which is the Month.



Output Format

The output prints the number of days. Refer to the sample output



Sample Input 1

2000

2



Sample Output 1

29 Days*/

import java.util.Scanner;

public class Num_days {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int year, month, num_days;
        year = s.nextInt();
        month = s.nextInt();
        if (year < 1900 || year > 9999 || month < 1 || month > 12) {
            System.out.println("0");
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    num_days = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    num_days = 30;
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                        num_days = 29;
                    else
                        num_days = 28;
                    break;
                default:
                    num_days = 0; // Invalid month
            }
            System.out.printf(num_days + " Days");
            s.close();
        }
    }
}

