/*Hollow Rectangle using solution of 
PROBLEM 16) Rectangle 
Display a rectangle of given length and width. 
Sample input:
4
5
Sample output
*****
*   *
*   *
*****
Hint 1: Print the character space (‘   ‘)  in themiddle.
Hint 2: You can re-use your solution to PROBLEM 
16 and use if condition to selectively print 
first and last star of each line and all stars 
of first and last line
*/
import java.util.*;
import static java.lang.System.*;

public class lab1t21
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(in);
        out.println("Enter height");
        int h=KB.nextInt();
        out.println("Enter length");
        int l=KB.nextInt();
        
        for(int i=1;i<=h;i++)
        {
            for(int j=1; j<=l; j++)
            {
                if(i==1||j==1||i==h||j==l)
                {
                    System.out.print("*");             
                }
                else
                    System.out.print(" ");
            }
            
            out.println();    
        }
    }
}

    
