//Given 10 inputs, sort them in an ascending order.
import java.util.*;
import static java.lang.System.*;

public class ascending
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
            int min = a[v];
            int minLocation = v;
            int index = minLocation+1;
            while(index < a.length)
            {
                if(a[index] < min)
                {
                    min = a[index];
                    minLocation = index;
                }
                ++index;
            }
            int temp = a[v];
            a[v] = min;
            a[minLocation] = temp;
            ++v;
        }
        for(int i=0;i<a.length;i++)
        {
            out.println(a[i]+" ");
        }
    }
}

