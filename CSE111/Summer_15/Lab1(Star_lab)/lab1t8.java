/*PROBLEM 8) Hollow Rectangle
Display a rectangle of given length and width. 
Sample input:
4
5
Sample output
12345
1   5
1   5
12345
Hint 1: Print the character space (‘   ‘) 
in the middle.
Hint 2: You can re-use your solution to 
PROBLEM 2) Rectangle and use IF condition to
selectively print first and last star of each
line and all stars of first and last line.

*/
import java.util.*;
import static java.lang.System.*;

public class lab1t8
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
                    System.out.print(j);             
                }
                else
                    System.out.print(" ");
            }
            
            out.println();    
        }
    }
}

    
