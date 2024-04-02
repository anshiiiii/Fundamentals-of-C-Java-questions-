package Java_Training.DailyTests;

/*Print Prime Numbers in a range



A prime number is divisible only by 1 and itself. You are given a positive integer. Write an algorithm to find all the prime numbers from 2 to the given positive number



Input Format:

The input consists of an integer.



Output Format:

Print space-separated integers representing the prime numbers till the given positive number.



Constraints:

1 < n< 109



Sample Input 1:

11



Sample Output 1:

2 3 5 7 11



Explanation:

For the given number the list of special numbers is [2, 3, 5, 7, 11]



Sample Input 2:

30



Sample Output 2:

2 3 5 7 11 13 17 19 23 29



Explanation:

For the given number the list of special numbers is [2,3, 5, 7, 11, 13, 17, 19, 23, 29]*/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
        
    }
}