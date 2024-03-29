package Java_Training.DailyTests;

import java.util.Scanner;

class Main 
{

    public static int gcd(int a, int b) 
	{
        if (b == 0) 
		{
            return a;
        } 
		else 
		{
            return gcd(b, a % b);
        }
    }

   
    public static int lcm(int a, int b) 
	{
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        
       
        int num1 = scanner.nextInt();
    
        int num2 = scanner.nextInt();

      
        int result = lcm(num1, num2);

      
        System.out.println(+ result);

        scanner.close();
    }
}
