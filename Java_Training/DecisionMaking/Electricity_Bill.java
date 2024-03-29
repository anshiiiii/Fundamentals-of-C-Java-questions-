package Java_Training.DecisionMaking;

/*In the city of Rajkot, Gujarat the Golden company is taking care of the expenses for the Court's discussion room. Due to continuous discussions regarding the upcoming 'Ring Road' project at Rajkot, the electricity bill was high and they need to pay it with all the money they have.

The electricity board has decided to charge money based on the units consumed by a particular home. If the units consumed are less than or equal to 200, the cost for one unit is 0.5paise. If the unit is less than or equal to 400, the cost for one unit is 0.65paise plus Rs.100 extra charge. If the unit is less than or equal to 600, the cost for one unit is 0.80paise plus Rs.200 extra charge. If the unit is greater than 600 the cost for one unit is Rs.1.25 plus Rs.425 extra charge. You need to calculate the electricity bill based on the units consumed.



Input Format

Input consists of one integer which corresponds to the units consumed.



Output Format

The output consists of one integer which corresponds to the electricity bill in Rupees.



Sample Input

200



Sample Output

Rs.100



Explanation

Here, the units consumed are equal to 200, and the cost for one unit is 0.5. Hence the electricity bill will be Rs.100.

*/


import java.util.*;

public class Electricity_Bill {

    public static void main(String[] args) {
        int n;
        Scanner z=new Scanner(System.in);
        n=z.nextInt();
        
        if(n<=200)
            System.out.print("Rs."+(int)(n*0.5));
        else if(n<=400)
            System.out.print("Rs."+(int)(n*.65+100));
        else if(n<=600)
            System.out.print("Rs."+(int)(n*.80+200));
        else
            System.out.print("Rs."+(int)(n*1.25+425));
        z.close();
        
    }
}
