/*Write a java program that reads 10 numbers 
 * from the user. Then read another number from
 * the user, and print “yes” if this number exists
 * among the first 10. Print “no” otherwise.*/
import java.util.*;
import static java.lang.System.*;

public class lab02t5
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
        
        out.println("Enter a number for checking");
        int j=KB.nextInt();
        int count=0;
        
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]==j)
            {
                count++;
            }
        }
        
        if(count>=1)
            out.println("Yes");
        else
            out.println("No");  
    }
}