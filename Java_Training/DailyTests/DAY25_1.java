package Java_Training.DailyTests;



import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        

        int greatest = Math.max(num1, Math.max(num2, num3));

        System.out.println(greatest + " is greater");
        
        scanner.close();
    }
}