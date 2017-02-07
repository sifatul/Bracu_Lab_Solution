/*Write a java program that reads 10 numbers from the user. After reading each number, print all the numbers that have been entered so far.
After user enters 11, print 11
After user enters 22, print 11, 22
…
After user enters 99, print 11, 22 ….. 99
*/

import java.util.Scanner;
public class lab8arraytask10
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
        int index=0;
        while(index < a.length)
        {
            System.out.print(a[index]+" ");
            ++index;
        }
    }
}
