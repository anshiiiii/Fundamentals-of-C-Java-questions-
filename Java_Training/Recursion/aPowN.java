package Java_Training.Recursion;

import java.util.Scanner;

class Main {

    public static long power(int a, int n) {
        if (n == 0)
            return 1;
        else
            return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.printf("The value of %d power %d is %d%n", a, n, power(a, n));
        scanner.close();
    }
}

