/*Q.Write a java program that reads two integers,
 * subtracts the smaller number from the larger one, 
 * and prints the result.
 */
import java.util.Scanner;
public class Lab4Task4
{
    public static void main (String[] args)
    {
        Scanner KB=new Scanner (System.in);
        int a, b;
        System.out.println ("Enter a number");
        a=KB.nextInt();
        System.out.println ("Enter another number");
        b=KB.nextInt();
        if (a>b)
        {
            int result;
            result=(a-b);
            System.out.println(result);
        }
        else if (a<b)
        {
            int result;
            result=(b-a);
            System.out.println(result);
        }    
    }
}    