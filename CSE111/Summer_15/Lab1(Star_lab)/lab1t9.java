/*Hollow Triangle - Left Justified
Draw right angled triangle of given height
Sample input:
5
Sample output
1
12
1 3
1  4
12345
*/
import java.util.*;
import static java.lang.System.*;

public class lab1t9
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
                    out.print(j);
                
                else if(j==1||j==i)
                {
                    out.print(j);
                }
                else
                    out.print(" ");
            }
            out.println();
        }
    }
}

