/*Write a Java program that will calculate the value of y if the
 * expression of y is as follows (n is the input):
 * y = 1^2- 2^2 +3^2 - 4^2.......+n^2
*/
import java.util.*;
import static java.lang.System.*;

public class lab03_0t6
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(in);
        out.println("Enter value of n");
        int n=KB.nextInt();
        int y=0;
        int num=1;
        int i=1;
        
        while(i<=n)
        {
            if(i%2!=0)
            {
                y=y+(i*i);
                i++;
            }
            else
            {
                y=y-(i*i);
                i++;
            }
        }
        
        out.println(y);
    }
}