/*An oil factory has N number of containers and each has a different capacity. During renovation, the manager decided to make some changes with the containers. He wishes to make different pairs for the containers in such a way that in the first pair, the container of maximum capacity is paired with the container of minimum capacity, and so on for the rest of the containers, to maintain a balance throughout all the pairs of containers.
Write an algorithm to make different pairs of containers in such a way that the first container in the pair is of maximum capacity and second container in the pair is of minimum capacity.


Input Format

The first line of the input consists of an integer - numContainers, representing the number of containers (N).
The next line consists of N space-separated integers - cont1, cont2, .... contN, representing container capacity.


Constraints

1 <= numContainers <= 1000
1 <= conti <= 1000
1 <= i <= numContainers


Output Format

Print K lines consisting of two space-separated integers representing the pairs that will be formed to maintain the balance by pairing the container of maximum capacity with the container of minimum capacity and so on.


Note
If only one container is left and no pair is possible then print the capacity of that container and the second value will be '0'.


Sample Input

6

100 560 23 19 53 20



Sample Output

560 19

100 20

53 23

*/

package Java_Training.Arrays1D;

import java.util.*;


class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    int p1=0,p2=n-1;
    while(p1<p2)
    {
		System.out.println(arr[p2] + " " + arr[p1]);
      p1++;
      p2--;
    }
    if(n%2 != 0)
    {
		System.out.println(arr[p2] +" 0");
    }
    sc.close();
  }
}