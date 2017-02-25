/*Write a program which reads 5 numbers into an
 * array, sorts/arranges the numbers from low 
 * to high and prints all numbers in the array.
If the user enters 7, 13, 2, 10, 6 then your
program should print 2, 6, 7, 10, and 13.

 * */

import java.util.Scanner;
public class lab9task4
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
