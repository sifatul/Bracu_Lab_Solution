/*Write a Java program that will ask the user to enter 10 numbers 
 * and will verify the users input after each entry. For example if
 * the user enters 2, the program will print “You have entered 2”,
 * then if the user enters 4 the program will print “You have
 * entered 2,  4”, then if the user enters 23 the program will
 * print “You have entered 2,  4 , 23”. This will go on till the
 * user enters the 10 numbers.*/

import java.util.*;
import static java.lang.System.*;

public class lab03_0t2
{
    public static void main(String[] args)
    {
        int a[]=new int[10];
        Scanner KB=new Scanner(in);
        
        for(int i=0;i<a.length;i++)
        {
            out.println("Enter a number");
            a[i]=KB.nextInt();
            out.print("You have entered ");
            int j=0;
            while(j<=i)
            {
                out.print(a[j]+",");
                j++;
            }
            out.println();
        }
    }
}
