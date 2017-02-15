//Using Recursion:Count even numbers found
//in an array

import java.util.*;
import static java.lang.System.*;

public class task11
{
    static Scanner KB = new Scanner(in) ;
    static int[] a = new int[5];
    public static void main(String[] args)
    {
        for(int i=0;i<a.length;i++)
        {
            out.println("Enter a number");
            a[i]=KB.nextInt();
        }
        int ec = evenCount(0);
        out.println(ec);
    }
    
    public static int evenCount(int num)
    {
        if(num==5)
        {
            return 0;
        }
        else
        {
            if(a[num]%2==0)
            {
                return 1+evenCount(num+1);
            }
            else
            {
                return evenCount(num+1);
            }
        }
    }
}