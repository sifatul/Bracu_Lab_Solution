/*Rectangle 
Sample input:
4
6
Sample output
123456
123456
123456
123456
 
Hint: One loop for lines, another loop for 
printing number 1 to i when it is line i.
*/

import java.util.*;
import static java.lang.System.*;

public class lab1t3
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
                out.print(j);
            }
            out.println();
        }
    }
}

