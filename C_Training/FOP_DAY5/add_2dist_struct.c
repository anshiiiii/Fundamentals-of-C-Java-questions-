/*Measurements continue to play an important role throughout everybody's life. Hari who is a sportsman has studied how to add two distances in inch feet system. Now he needs to do the programming for the same. Help him to write a program to add two distances in inch feet system using Structure

Note: 1feet = 12inch
Input Format

Input 1: feet1 and Inch1
Input 2: feet2 and Inch2
Feet is in integer data type and inch is in float data type


Output Format

The output prints the Sum of Distance.



Sample Input 0

22

4.7

23

7.9



Sample Output 0

﻿46'-0.6"

*/
#include <stdio.h>

struct Distance {
    int feet;
    float inch;
};

int main() {
    struct Distance d1, d2, sum;

    scanf("%d %f", &d1.feet, &d1.inch);

    scanf("%d %f", &d2.feet, &d2.inch);

    sum.feet = d1.feet + d2.feet;
    sum.inch = d1.inch + d2.inch;

    // Convert inches to feet if necessary
    if(sum.inch >= 12.0) {
        sum.inch -= 12.0;
        ++sum.feet;
    }

    printf("%d'-%g\"\n", sum.feet, sum.inch);  //to handle or print both int and float vlues

    return 0;
}
