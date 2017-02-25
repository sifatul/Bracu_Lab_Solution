/*Write a java program that reads a student’s
 * mark for a single subject,
 * and prints out the corresponding grade for that mark. 
 * The mark ranges and corresponding grades 
 * are shown in the table below.
 * 90 and above A
   80-89 B
   70-79 C
   60-69 D
   50-59 E
   Below 50 F
 */

import java.util.Scanner;
public class Lab4Task10
{
    public static void main (String[] args)
    {
        Scanner KB=new Scanner (System.in);
        int a;
        System.out.println ("Enter a number");
        a=KB.nextInt();
       
        if (a>=90)            
        {   
            System.out.println("A");
        }
        
        else if (a>=80)
        {
            System.out.println("B");
        }
        
        else if (a>=70)
        {
            System.out.println("C");
        }
        
        else if (a>=60)
        {
            System.out.println("D");
        }            
        
        else if (a>=50)
        {
            System.out.println("E");
        }            
        
        else
        {
            System.out.println("F");
        }            
    }
}    