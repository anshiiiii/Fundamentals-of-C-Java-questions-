package Java_Training.DecisionMaking;

/*Penny is celebrating her 25th birthday. Her friend Leonard promised her that he will buy her a pair of new shoes on her birthday if she solves the question asked by him. He asks Penny to find out whether the year in which she was born is a leap year or not. Help her to solve this puzzle so that she celebrates her birthday happily. If her birth year is 1995 and it is a leap year display “1995 is a leap year.” Else display “1995 is not a leap year.”



Input Format

The input consists of 1 integer.



Output Format

The output consists of 1 string.



Sample Input 

2016



Sample Output 

2016 is a leap year

*/

import java.util.Scanner;

public class Gift_Bday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int birthYear = scanner.nextInt();


        boolean isLeapYear = (birthYear % 4 == 0 && birthYear % 100 != 0) || (birthYear % 400 == 0);


        if (isLeapYear) {
            System.out.printf("%d is a leap year%n", birthYear);
        } else {
            System.out.printf("%d is not a leap year%n", birthYear);
        }
        scanner.close();
    }
}

