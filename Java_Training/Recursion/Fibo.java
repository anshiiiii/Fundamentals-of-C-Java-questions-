package Java_Training.Recursion;

import java.util.Scanner;

class Main {
   
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.printf("The term %d in the Fibonacci series is %d%n", n, fibonacci(n - 1));
        scanner.close();
    }
}

