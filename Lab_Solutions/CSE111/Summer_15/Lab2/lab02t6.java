/*Write a java program that reads 15 numbers 
 * from the user, all the numbers within the 
 * range 0-9. Then print the number of times 
 * each number has been entered by the user.*/

import java.util.*;
import static java.lang.System.*;

public class lab02t6
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(in);
        
        int[] a=new int[15];
        int[] counter=new int[a.length];
        
        for (int i=0;i<a.length;i++)
        {
            out.println("Enter a number between 0 and 9");
            int temp=KB.nextInt();
            if(temp>=0&&temp<=9)
                a[i]=temp;
            else
            {
                out.println("Number must be between 0 and 9");
                i--;
            }
        }
        for(int count=0;count<a.length;count++)
        {
            for(int counts=0;counts<a.length;counts++)
            {
                if(a[counts]==count)
                {
                    counter[count]+=1;
                }
            }
        }
        for(int count=0;count<a.length;count++)
        {
            out.println(count+" has been entered "+counter[count]+" time(s)");        
        }
    }
}
