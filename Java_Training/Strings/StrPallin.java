package Java_Training.Strings;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.next();

        String reversed = new StringBuilder(original).reverse().toString();

        
        boolean isPalindrome = original.equals(reversed);


        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        scanner.close();
    }
}
