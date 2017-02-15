/*Using Recursion:Take 10 numbers from the user
 * and print sum
 *N.B.Run the tester for output
 */
import java.util.*;
import static java.lang.System.*;
public class task9
{
    int sum = 0;
    Scanner KB = new Scanner(in);
    public void sumLoop(int num)
    {
        if(num==10)
        {
            System.out.println(sum);
        }
        else
        {
            System.out.println("Enter a number");
            int val = KB.nextInt();
            sum = sum + val;
            sumLoop(num+1);
        }
    }
}
