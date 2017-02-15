/*Write a java program that reads 10 numbers 
 * from the user, but does not allow the user
 * to enter duplicates. This means that if a
 * number has been entered already, the program
 * will not accept it as input again and instead
 * ask the user to enter a different number. */

import java.util.*;
import static java.lang.System.*;

public class lab02t8
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(in);
        int a[] = new int [10];
        for(int i=0;i<a.length;i++)
        {
            out.println("Enter a number");
            int num=KB.nextInt();
            int count=0;
            for(int j=0;j<=i;j++)
            {
                if(a[j]==num)
                {
                    count=1;
                    break;
                }                
            }
            if(count==0)
            {
                a[i]=num;
            }
            else
            {
                out.println("Please enter a number that wasn't entered before");
                i--;
            }
        }
    }
}