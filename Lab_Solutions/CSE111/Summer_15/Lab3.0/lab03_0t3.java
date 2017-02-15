/*Write a Java program that would input ten numbers from the user
 * and print the ten numbers sorted in descending order.
 */
import java.util.*;
import static java.lang.System.*;

public class lab03_0t3
{
    public static void main(String[] args)
    {
        int a[]=new int[10];
        Scanner KB=new Scanner(in);
        
        for(int i=0;i<a.length;i++)
        {
            out.println("Enter a number");
            a[i]=KB.nextInt();
        }
        
        int v=0;
        while(v < a.length-1)
        {
            int max = a[v];
            int maxLocation = v;
            int index = maxLocation+1;
            while(index < a.length)
            {
                if(a[index] > max)
                {
                    max = a[index];
                    maxLocation = index;
                }
                ++index;
            }
            int temp = a[v];
            a[v] = max;
            a[maxLocation] = temp;
            ++v;
        }
        for(int i=0;i<a.length;i++)
        {
            out.println(a[i]+" ");
        }
    }
}

