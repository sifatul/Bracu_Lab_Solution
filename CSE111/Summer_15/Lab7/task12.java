//Using Recursion: Find factiorial of given number
import java.util.*;
import static java.lang.System.*;

public class task12
{
    static Scanner KB = new Scanner(in) ;
    public static void main(String[] args)
    {
        out.println("Enter a number");
        int n = KB.nextInt();
        out.println(fact(n));
    }
    
    public static int fact(int n)
    {
        int result;
        
        if(n==1)
            return 1;
        
        result = fact(n-1) * n;
        return result;
    }
}

