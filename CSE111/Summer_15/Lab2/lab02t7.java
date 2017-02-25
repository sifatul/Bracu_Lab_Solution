/*Write a java program that reads 10 numbers 
 * from the user. After reading each number,
 * print all the numbers that have been entered so far.*/
import java.util.*;
import static java.lang.System.*;

public class lab02t7
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(in);
        
        int[] a=new int[10];
        
        for (int i=0;i<a.length;i++)
        {
            out.println("Enter a number");
            a[i]=KB.nextInt();
            
            
            for(int j=0;j<=i;j++)
            {
                out.println(a[j]);
            }
        }
    }
}
