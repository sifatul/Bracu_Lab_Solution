/*Using Recursion:Sum 10 numbers found in an array
 *N.B.Run the tester for output
 */
import java.util.*;
import static java.lang.System.*;
public class task10
{
    int sum = 0;
    int [] a = {1,2,3,4,5,6,7,8,9,10};
    public void sumLoop(int num)
    {
        if(num==a.length)
        {
            System.out.println(sum);
        }
        else
        {
            sum = sum + a[num];
            sumLoop(num+1);
        }
    }
}
