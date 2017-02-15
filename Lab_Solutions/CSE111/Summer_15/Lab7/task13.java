//Using Recursion:Find fibonacci series till the
//given number
import java.util.*;
import static java.lang.System.*;

public class task13
{
    static Scanner KB = new Scanner(in) ;
    public static void main(String[] args)
    {
        out.println("Enter a number");
        int n = KB.nextInt();
        out.println(fibonacci(n));
    }
    public static int fibonacci(int n)
    {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}