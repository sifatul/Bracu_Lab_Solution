/*Write a java program that reads 10 numbers 
 *from the user, but does not allow the user 
 *to enter duplicates. This means that if a 
 *number has been entered already, the program
 * will not accept it as input again and instead
 * ask the user to enter a different number.*/

import java.util.Scanner;
public class lab8arraytask11
{
    public static void main(String[] args)
    {
        int[] a=new int[5];
        for(int count=0;count<5;count++)
        {
            Scanner KB=new Scanner(System.in);
            System.out.println("Please enter a number");
            a[count]=KB.nextInt();
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
        int index=0;
        while(index < a.length)
        {
            System.out.print(a[index]+" ");
            ++index;
        }
    }
}
