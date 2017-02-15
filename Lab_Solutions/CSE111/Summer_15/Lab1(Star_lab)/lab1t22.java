/*Hollow Triangle - Left Justified using solution of PROBLEM 17) Triangle - Left Justified
Draw right angled triangle of given height
Sample input:
5 
Sample output
*
**
* *
*  *
*****
*/
import java.util.*;
import static java.lang.System.*;

public class lab1t22
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(in);
        out.println("Enter height");
        int h=KB.nextInt();
        
        for(int i=1;i<=h;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==h)
                    out.print("*");
                
                else if(j==1||j==i)
                {
                    out.print("*");
                }
                else
                    out.print(" ");
            }
            out.println();
        }
    }
}

