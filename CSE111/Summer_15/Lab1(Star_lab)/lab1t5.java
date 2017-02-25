/*Triangle - Right Justified
Draw right angled triangle of given height
Sample input:
4
Sample output
   1
  12
 123
1234
*/
import java.util.*;
import static java.lang.System.*;

public class lab1t5
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
            for(int k=1;k<=i;k++)
            {
                out.print(k);
            }
            
            out.println();    
        }
    }
}

