/*Triangle - Left Justified
Draw right angled triangle of given height
Sample input:
4
Sample output
*
**
***
****
Hint: One loop for lines, another loop 
for printing i number of stars when it is line i.
*/
import java.util.*;
import static java.lang.System.*;

public class lab1t17
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
                out.print("*");
            }
            out.println();
        }
    }
}

