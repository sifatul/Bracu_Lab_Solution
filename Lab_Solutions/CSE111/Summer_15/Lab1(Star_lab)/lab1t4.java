/*Triangle - Right Justified
Draw right angled triangle of given height
Sample input:
4
Sample output
   4
  34
 234
1234

*/
import java.util.*;
import static java.lang.System.*;

public class lab1t4
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
                out.print(k);
            }
            p--;
            out.println();    
        }
    }
}

