package Java_Training.DailyTests;


import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        

        int num = scanner.nextInt();

        if (num > 0) 
		{
            System.out.println("Positive");
        } else if (num < 0) 
		{
            System.out.println("Negative");
        } else 
		{
            System.out.println("Zero");
        }
        
        scanner.close();
    }
}