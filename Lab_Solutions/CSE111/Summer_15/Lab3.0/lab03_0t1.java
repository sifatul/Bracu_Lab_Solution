/*Write a Java program that would input ten numbers from the user
 and print the ten numbers in reverse order.
*/
import java.util.*;
import static java.lang.System.*;

public class lab03_0t1
{
    public static void main(String[] args)
    {
        Scanner KB = new Scanner(in);
        int[] a = new int[10];
        
        for(int i=0;i<a.length;i++)
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