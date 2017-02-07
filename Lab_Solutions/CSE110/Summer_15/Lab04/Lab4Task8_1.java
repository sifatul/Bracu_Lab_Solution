/*Write a java program that reads an integer,
*and prints the integer if it is a multiple of either 2 or 5.
For example, 2, 4, 5, 6, 8, 10, 12, 14, 15, 16, 18, 20, 22 …
 */

import java.util.Scanner;
public class Lab4Task8_1
{
    public static void main (String[] args)
    {
        Scanner KB=new Scanner (System.in);
        int a;
        System.out.println ("Enter a number");
        a=KB.nextInt();
       
        if (a%2==0)
        {
            System.out.println(a);
        }
        
        else if (a%5==0)
        {
            System.out.println(a);
        }            
        
    }
}    