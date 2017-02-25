/*Triangle - Right Justified
Draw right angled triangle of given height
Sample input:
4
Sample output
   *
  **
 ***
****
Hint: Count and print appropriate number of space
s in front of stars. Notice that there is one 
less space and one more star in each line.
*/
import java.util.*;
import static java.lang.System.*;

public class lab1t18
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(in);
        out.println("Enter height");
        int h=KB.nextInt();
        int p=h;
                        
        for(int i=1;i<=h;i++)
        {
            for(int j=h-1;j>=i;j--)
            {
                out.print(" ");
            }
            for(int k=p;k<=h;k++)
            {
                out.print("*");
            }
            p--;
            out.println();    
        }
    }
}

