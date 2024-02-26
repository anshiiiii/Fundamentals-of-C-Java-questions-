#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int a[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    int check = 1;
    for(int i=0;i<n;i++)
    {
        for(int j=n-1;j>i;j--)
        {
            if(a[i][j]!=0)
            {
                check = 0;
                break;
            }
        }
    }
    if(check == 1)
    {
        printf("Lower triangular matrix");
    }
    else
    {
        printf("Not a lower triangular matrix");
    }
}