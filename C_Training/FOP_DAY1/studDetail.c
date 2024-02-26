#include <stdio.h>
int main()
{
  int age;
  char name[100];
  float cgpa;
  char grade;
  scanf("%s %d %f %c", name,&age,&cgpa,&grade);
  printf("Name: %s\n",name);
  printf("Age: %d\n",age);
  printf("CGPA: %.2f\n",floor(cgpa * 100)/100);
  printf("Grade: %c",grade);
  return 0;
}