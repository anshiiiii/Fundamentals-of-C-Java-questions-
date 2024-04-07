package Java_Training.DailyTests;


import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(); 
        int num2 = scanner.nextInt(); 

        System.out.println(gcd(num1, num2)); 
        scanner.close();
    }

   
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
