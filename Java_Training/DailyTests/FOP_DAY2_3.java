/*Ram created a strange number series in which he had 3 numbers already and from 4th number every number is the sum of previous three numbers of the series. 
For example, if the given 3 numbers is 1 2 3 and we have to find nth number of this series, then the answer will be the sum of the previous 3 numbers (n - 1)th + (n - 2)th + (n - 3)th number.

You have to print the nth term of the given series.



Input Format:

First line contain no of test cases t, next t lines contains 4 integers a, b, c, n - a, b, c are the first 3 numbers of the series and we have to find nth term.



Output Format:

Print only one integer - nth term of series.



Constraints:

1. 1 <= T <= 3

2. 1 <= A, B, C <= 100

3. 4 <= N <= 10



Sample Input:

3

1 3 2 4

1 3 2 5

1 3 2 6



Sample Output:

6

11

19



Explanation: In first test case the first three values are 1, 3, 2 than the 4th term will be sum of previous three term - 2 + 3 + 1 = 6.*/

package Java_Training.DailyTests;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt(); 
            int b = scanner.nextInt();
            int c = scanner.nextInt(); 
            int n = scanner.nextInt(); 
           
            for (int j = 4; j <= n; j++) {
                int next = a + b + c;
                a = b;
                b = c;
                c = next;
            }

            System.out.println(c);
        }
        scanner.close();
    }
}
