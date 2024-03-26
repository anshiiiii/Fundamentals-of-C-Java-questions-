package Java_Training.DailyTests;

import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        

        char ch = scanner.next().charAt(0);
        

        if (Character.isLetter(ch))
	    {

            ch = Character.toLowerCase(ch);
            
 
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
			{
                System.out.println("Vowel");
            } 
			else 
			{
                System.out.println("Consonant");
            }
        } 
		else 
		{
            System.out.println("Not an alphabet");
        }
        
        scanner.close();
    }
}