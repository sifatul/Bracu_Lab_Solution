/*Write a java program that reads 10 numbers
 * from the user. Write the program in such a
 * way so that 
if the user enters 
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
then the output should be 
1, 3, 5, 7, 9, 2, 4, 6, 8, 10.
If the user enters
10, 20, 30, 40, 50, 60, 70, 80, 90, 100,
then the output should be
10, 30, 50, 70, 90, 20, 40, 60, 80, 100.
If the user enters
2, 5, 6, 9, 12, 13, 14, 15, 16, 17 
then the output should be 
2, 6, 12, 14, 16, 5, 9, 13, 15, 17. 
*/

import java.util.Scanner;
public class lab9task8
{
    public static void main(String[] args)
    {
        int[] a=new int[10];
        for(int count=0;count<10;count++)
        {
            Scanner KB=new Scanner(System.in);
            System.out.println("Please enter a number");
            a[count]=KB.nextInt();
        }
        /*(int v=0;
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
        }*/
        for(int j=0;j<a.length;j+=2)
        {
                System.out.println(a[j]+" ");                
        }
        for(int j=1;j<a.length;j+=2)
        {
                System.out.println(a[j]+" ");                
        }
    }
}
