package Java_Training.Recursion;


import java.util.Scanner;

public class Prime {
 
    public boolean isPrime(int a, int i) {
        if (i == 1) {
            return true;
        } else {
            if (a % i == 0) {
                return false;
            } else {
                return isPrime(a, i - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Prime main = new Prime(); 
        if (n < 2) {
            System.out.println("Not a Prime Number");
        } else {
            if (main.isPrime(n, n / 2)) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a Prime Number");
            }
        }
        scanner.close();
    }
}
