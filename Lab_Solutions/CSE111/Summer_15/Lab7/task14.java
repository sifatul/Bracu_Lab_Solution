//Using recursion:Given a number, print its factors
//If it's a prime number print'Input is a prime number'
import java.util.*;
import static java.lang.System.*;
public class task14
{
    public static void main(String[] args)
    {
        Scanner KB = new Scanner(in);
        out.println("Enter number");
        int num1 = KB.nextInt();
        if(isPrime(num1, num1 - 1))
        {
            out.println("Input is a prime number");
        }
        else
        {
            out.println();
        }
    }
    
    public static boolean isPrime(int input, int i) 
    {
        if (i <= 1) 
        {
            return true;
        }
        if (input % i != 0) 
        {
            return isPrime(input, i-1);
        } 
        else 
        {
            factors(input, i);
            return false;
        }
    }
    public static void factors(int input, int i)
    {
        if (i <= 1) 
        {
            out.print(" "+1);
        } 
        else 
        {
            if (input % i == 0) 
            {
                out.print(" "+i);
            }
            factors(input, i - 1);
        }
    }
}