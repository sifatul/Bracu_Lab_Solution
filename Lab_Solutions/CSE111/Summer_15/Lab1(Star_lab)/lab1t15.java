/*Star Line
Print as many stars as given in input
Sample input:
6
Sample output
******
*/
import java.util.*;
import static java.lang.System.*;

public class lab1t15
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(in);
        out.println("Enter a number");
        int i=KB.nextInt();
        
        for(int count=1;count<=i;count++)
        {
            out.print("*");
        }
    }
}
  
