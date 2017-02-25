/*Write a java program that reads an integer,
*and prints the integer if it is a multiple of NEITHER 2 NOR 5.
For example, 1, 3, 7, 9, 11, 13, 17, 19, 21, 23, 27, 29, 31, 33, 37, 39 …
 */

import java.util.Scanner;
public class Lab4Task8_4
{
    public static void main (String[] args)
    {
        Scanner KB=new Scanner (System.in);
        int a;
        System.out.println ("Enter a number");
        a=KB.nextInt();
       
        if (a%2!=0)
        {
         if (a%5!=0)   
            System.out.println(a);
        } 
                    
    }
}    