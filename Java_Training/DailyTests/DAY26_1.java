/*Naveen bought 2 bangles for his elder sister Ragavi, as a birthday gift. Before presenting the gift, Naveen challenges his sister to answer his question blindfolded. He places both the bangles on the table and asks Ragavi to answer two questions: 1) Are the two bangles intersecting or touching or not touching? 2) What is the distance between the centers of the bangles? To answer these questions, Naveen gives the centers C1(x1, y1) and C2(x2, y2) and radius R1 and R2 of the bangles. Now write a java program to help Ragavi to answer her brother's questions.



Input format:

First line of the input consists of two integers separated by a space which corresponds to x1 and y1 values, respectively.

Second line of the input consists of two integers separated by a space which corresponds to x2 and y2 values, respectively.

Third line of the input consists of two integers separated by a space which corresponds to R1 and R2 values, respectively.



Output Format:

First line of the Output is a string ,"Intersects" or "Touches" or "Do not Touch".

Second line of the output is a float value which corresponds to the distance between the two centers of the bangles, Rounded-off to 2 decimal points.



Sample Input 1:

3 4

14 18

5 8

Sample Output 1:

Do not Touch

17.80



Sample Input 2:

3 4

4 6

4 5

Sample Output 2:

Intersects

2.24



Sample Input 3:

1 1

3 1

1 1

Sample Output 3:

Touches

2.00

*/

package Java_Training.DailyTests;

import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        
 
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int R1 = scanner.nextInt();
        int R2 = scanner.nextInt();
        

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
     
        if (distance <= R1 + R2) 
		{
            if (distance == R1 + R2) 
			{
                System.out.println("Touches");
            } 
			else 
			{
                System.out.println("Intersects");
            }
        } 
		else 
		{
            System.out.println("Do not Touch");
        }
        
 
        System.out.printf("%.2f", distance);
        
        scanner.close();
    }
}