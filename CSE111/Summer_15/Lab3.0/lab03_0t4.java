/*Write a Java program that would ask the user to enter five 
 * numbers. As the user enters the five numbers the program will 
 * make sure that all the numbers entered by the user are unique.
 * For example if the user enters 2, 3, 4, 6, and then tries to 
 * enter 3 again the program will display that 3 is already in 
 * among the entered numbers and would ask the user to enter a 
 * new number. You will have to keep taking numbers from the user
 * until you receive five unique numbers. At the end, print those
 * five unique numbers.*/

import java.util.*;
import static java.lang.System.*;

public class lab03_0t4
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(in);
        int a[] = new int [5];
        for(int i=0;i<a.length;i++)
        {
            out.println("Enter a number");
            int num=KB.nextInt();
            int count=0;
            for(int j=0;j<=i;j++)
            {
                if(a[j]==num)
                {
                    count=1;
                    break;
                }                
            }
            if(count==0)
            {
                a[i]=num;
            }
            else
            {
                out.println("Please enter a number that wasn't entered before");
                i--;
            }
        }
    }
}