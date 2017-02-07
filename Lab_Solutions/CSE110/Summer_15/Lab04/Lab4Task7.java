/*Write a java program that reads an integer,
 * and if the number is even and greater than 10,
 * prints “An even number greater than 10”.
 * If the number is even but lesser than 10, 
 * print “An even number not greater than 10”.
 * If the number is greater than 10 but odd,
 * print “An odd number greater than 10”. 
 * If the number is odd and also less than 10,
 * print “An odd number less than 10”.
 */
import java.util.Scanner;
public class Lab4Task7
{
    public static void main (String[] args)
    {
        Scanner KB=new Scanner (System.in);
        int a;
        System.out.println ("Enter a number");
        a=KB.nextInt();
       
       if (a>10)
       {    
        if (a%2==0)
        {
             System.out.println("An even number greater than 10");
        }
        else if (a%2!=0)
        {
            System.out.println("An odd number greater than 10");
        }
       } 
       if (a<10)
       {    
        if (a%2==0)
        {
            System.out.println("An even number not greater than 10");
        }
        else if (a%2!=0)
        {
            System.out.println("An odd number not greater than 10");
        }
       } 
    }
}    