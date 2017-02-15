/*Write a java program that reads 10 numbers 
 * from the user, and then prints them in the
 * reverse order.*/

import java.util.*;
import static java.lang.System.*;

public class lab02t3
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(in);
        
        int[] a=new int[10];
        
        for (int i=0;i<a.length;i++)
        {
            out.println("Enter a number");
            a[i]=KB.nextInt();
        }
        
       for(int i=a.length-1;i>=0;i--)
       {
           out.println(a[i]);
       }
    }
}