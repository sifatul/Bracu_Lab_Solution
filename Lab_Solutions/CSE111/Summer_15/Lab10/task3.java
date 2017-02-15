/*When we enter 3 (or any number less than 6), 
 * then “a[5]=99;” line will cause error.
 * Giving 6 or greater numbers will not cause 
 * that problem. Regardless of the number, “n/0”
 * will always cause error.

Modify the program above to handle exception
‘ArithmeticException’ and ‘ArrayIndexOutOfBoundsException’ 
using try, catch and finally keywords. 
Inside finally, just print the message “THE END”.
*/
import java.util.*;
import static java.lang.System.*;
public class task3
{
    public static void main(String[] args)
    {
        Scanner KB = new Scanner(in);
        int [] a = new int[5];
        out.println("Enter a number");
        int n = KB.nextInt();
        
        try
        {
            a[n] = 100;
            int x = n/0;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        }
        catch(ArithmeticException e)
        {
        }
        finally
        {
            out.println("THE END");
        }
    }
}