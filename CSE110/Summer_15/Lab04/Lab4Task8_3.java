/*Write a java program that reads an integer,
*and prints the integer if it is a multiple of 2 and 5.
For example, 10, 20, 30, 40, 50 …
 */

import java.util.Scanner;
public class Lab4Task8_3
{
    public static void main (String[] args)
    {
        Scanner KB=new Scanner (System.in);
        int a;
        System.out.println ("Enter a number");
        a=KB.nextInt();
       
        if (a%2==0)
        {
         if (a%5==0)   
            System.out.println(a);
        } 
                    
    }
}    