/*Write a java program that reads a student’s mark for a single subject,
 * and prints out “Pass” if the student got more than 50,
 * and “You shall not pass” otherwise.
 */
import java.util.Scanner;
public class Lab4Task9
{
    public static void main (String[] args)
    {
        Scanner KB=new Scanner (System.in);
        int a;
        System.out.println ("Enter a number");
        a=KB.nextInt();
       
        if (a>50)            
        {   
            System.out.println("Pass");
        }
        
        else
        {
            System.out.println("You shall not pass");
        }            
    }
}    