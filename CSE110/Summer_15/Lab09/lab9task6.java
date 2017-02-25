/*Write a program which asks the user how many
 * numbers to take. Then takes that many numbers
 * and prints the median value. Read
 * http://www.mathsisfun.com/median.html
If the user gives 10, 50, 40, 20, 30.Then the
median is 30 (because 30 falls in middle 10, 20, 30, 40, 50)
If the user gives 30, 10, 40, 20. Then the
median is 25 because,
(20+30)/2=25 (average of two middle values from 10, 20, 30, 40)
*/

import java.util.Scanner;
public class lab9task6
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(System.in);
        System.out.println("Please give number of values");
        int n=KB.nextInt();
        int[] a=new int[n];
        for(int count=0;count<n;count++)
        {
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
        if(n%2==0)
        {
            int med=n/2;
            int median=((a[med]+a[med-1])/2);
            System.out.println("Median="+median);
        }
        else
        {
            int med=n/2;
            int median=(med);
            System.out.println("Median="+a[median]);    
        }
    }
}


