/*Rectangle using solution of PROBLEM 15) Star Line
Sample input:
4
6
Sample output
******
******
******
******
*/
import java.util.*;
import static java.lang.System.*;

public class lab1t16
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
            for(int j=1;j<=l;j++)
            {
                out.print("*");
            }
            out.println();
        }       
    }
}

