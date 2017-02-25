/*Write a java program that reads an integer,
 * and prints the integer if it is NOT a multiple of 2 OR 
 * NOT a multiple of 5.
 */
import java.util.Scanner;
public class Lab4Task8_5
{
    public static void main (String[] args)
    {
        Scanner KB=new Scanner (System.in);
        int a;
        System.out.println ("Enter a number");
        a=KB.nextInt();
       
        if (a%2!=0)
        {
            System.out.println(a);
        }
        
        else if (a%5!=0)
         {
            System.out.println(a);
         }  
                    
    }
}    