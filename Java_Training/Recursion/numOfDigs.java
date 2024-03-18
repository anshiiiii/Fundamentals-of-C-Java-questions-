package Java_Training.Recursion;

import java.util.Scanner;

class Main {
    
    public static int countDigits(int n) {
        if (n == 0)
            return 0;
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("The number of digits in " + num + " is " + countDigits(num));
        scanner.close();
    }
}
