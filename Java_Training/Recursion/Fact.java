package Java_Training.Recursion;

import java.util.Scanner;

class Main {
   
    public static long factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 0)
            System.out.println("Factorial of a negative number doesn't exist.");
        else
            System.out.println("The factorial of " + num + " is " + factorial(num));
        scanner.close();
    }
}
