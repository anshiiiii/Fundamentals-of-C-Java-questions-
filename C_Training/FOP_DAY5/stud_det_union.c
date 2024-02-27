/*Write a program to read and display student data using union.



Input Format

- The first character input consists of the grade of the student

- The second character array input consists of the roll number of student

- The third float input consists of the mark of the student

- The fourth integer input consists of the fees for student



Output Format

Refer to the sample output



Sample Input 0

Grade is: A

Rollno is: 15EC110

Mark is: 78.98

Fees paid is: 25000

*/
#include <stdio.h>
#include <string.h>
#include <math.h>
union Student {
    char grade;
    char rollno[50];
    float marks;
    int fees;
};

int main() {
    union Student s;
    scanf("%c", &s.grade);
    printf("Grade is: %c\n", s.grade);
    scanf("%s",&s.rollno);
    printf("Rollno is: %s\n",s.rollno);
    scanf("%f",&s.marks);
    if(((int)s.marks)*100!=(int)(s.marks*100))
      printf("Mark is: %.2f\n",s.marks);
    else
      printf("Mark is: %d\n",(int)s.marks);
    scanf("%d",&s.fees);
    printf("Fees paid is: %d\n", s.fees);

    return 0;
}
