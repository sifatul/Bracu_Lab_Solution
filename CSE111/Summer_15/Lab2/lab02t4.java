/*Write a java program that reads 20 numbers
 from the user,and then prints only the even
 numbers in reverse order*/

import java.util.*;
import static java.lang.System.*;

public class lab02t4
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(in);
        
        int[] a=new int[20];
        
        for (int i=0;i<a.length;i++)
        {
            out.println("Enter a number");
            a[i]=KB.nextInt();
        }
        
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]%2==0)
                out.println(a[i]);
        }
    }
}