/*Run your solution of Task3 and give 2.5 as input
 It will cause error.
Now you see that it is hard to know every error
that may occur in advance. Hence, modify your 
solution to Task 3 to account for all other 
unknown errors that can be caused from any line
of the main method. 
*/
 
import java.util.*;
import static java.lang.System.*;
public class task4  
    
{
    public static void main(String[] args)
    {
        Scanner KB = new Scanner(in);
        int [] a = new int[5];
        out.println("Enter a number");
        
        try
        {
            int n = KB.nextInt();
            a[n] = 100;
            int x = n/0;
        }
        
        catch(Exception e)
        {
            out.println("Exception caught");
        }
        
        finally
        {
            out.println("THE END");
        }
    }
}