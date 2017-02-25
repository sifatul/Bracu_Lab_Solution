/*Hollow  Triangle – Isosceles
Draw triangle of given height
Sample input 1:
3
Sample output 1:
  1
 1 3
12345

Sample input 2:
4

Sample output 2:
   1
  1 3
 1   5
1234567
*/
import java.util.*;
import static java.lang.System.*;

public class lab1t11
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
                if(k<=(h-k)-1)
                {
                    out.print(" ");
                }
                else
                    out.print(k);
            }
            
            out.println();    
        } 
    }
}

