package Java_Training.DailyTests;
/*Write a java program to find the prime numbers in given range in the given input.



Input format:

The input consist of two Integers



Output format:

The output consists of Integers



Sample Input:

4

10

Sample Output:

5

7
here in other test cases 2 is not printed so i>2 else it will be i>1 */
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt(); 
        int end = scanner.nextInt(); 

        for (int i = start; i <= end; i++) {
            if (i > 2 && isPrime(i)) {
                System.out.println(i);
            }
        }
        scanner.close();
    }

    
    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
