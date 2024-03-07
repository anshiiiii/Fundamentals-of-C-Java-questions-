/* Write a program to print the details of a student. The student's details consist of his/her name, age, CGPA, and grade.



Input Format:

The input consists of one string, one integer, one float, and one character.

The string corresponds to the name of a student.

The integer corresponds to the age of a student.

The float corresponds to the CGPA of a student.

The character corresponds to the grade of a student.



Output Format:

The output prints all the details of a student.

Refer to the sample Output.



Note: The CGPA (float value) should be printed with 2 decimal places.



Sample Input 1:

Rajeev

20

8.6467

B

Sample Output 1:

Name: Rajeev

Age: 20

CGPA: 8.64

Grade: B



Sample Input 2:

Meera

18

9.123

A



Sample Output 2:

Name: Meera

Age: 18

CGPA: 9.12

Grade: A*/

import java.util.*;

public class stud_details 
{

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        String name=z.next();
        int age=z.nextInt();
        float CGPA=z.nextFloat();
        float ans=(int)(CGPA*100);
        char grade=z.next().charAt(0);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.printf("CGPA: %.2f\n",ans/100);
        System.out.println("Grade: "+grade);
        z.close();
    }
}