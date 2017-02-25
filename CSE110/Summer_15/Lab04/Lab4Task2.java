/* Q.Write a java program that reads two integers from the user.
 * Your program should then print “first is greater” if the 
 * first number is greater, and “first is not greater” otherwise.
 */
import java.util.Scanner;
public class Lab4Task2
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
            System.out.println("first is greater");
        }
        else
        {
            System.out.println("first is not greater");
        }
    }
}    