/*Rhombus using PROBLEM 19) Triangle - Isosceles
Just draw the image of the above triangle once.
And then, the opposite, once.
Sample input:
3
Sample output
  *
 ***
*****
 ***
  *
 
*/
import java.util.*;
import static java.lang.System.*;

public class lab1t20
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(in);
        out.println("Enter height");
        int h=KB.nextInt();
        
        
        for(int i=1;i<=h;i++)
        {
            for(int j=h-1;j>=i;j--)
            {
                out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++)
            {
                out.print("*");
            }
            out.println();
        }
        
        for(int i=h-1;i>=1;i--)
        {
            for(int j=1;j<=h-i;j++)
            {
                out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++)
            {
                out.print("*");
            }
            
            out.println();    
        }
    }
}

    
