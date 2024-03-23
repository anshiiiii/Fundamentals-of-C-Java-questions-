/*Write a program to sort a string in ascending order. Note: Do not use inbuilt functions.



Input Format

The input consists of the string s in a single line.



Output Format

Display the sorted string in ascending order.



Sample Input 0

faceprep



Sample Output 0

﻿aceefppr

*/
package Java_Training.Strings;

import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

      
        char[] charArray = str.toCharArray();


        for (int i = 0; i < charArray.length - 1; i++) 
        {
            for (int j = i + 1; j < charArray.length; j++) 
            {
                if (charArray[i] > charArray[j]) 
                {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }

       
        String sortedStr = new String(charArray);

        System.out.println(sortedStr);
        scanner.close();
    }
}
