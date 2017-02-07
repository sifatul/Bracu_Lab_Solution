/*Write a program which reads 5 numbers into an
 * array and prints the largest number. 
If the user enters 7, 13, 2, 10, 6 then your
program should print 13.
 */

import java.util.Scanner;
public class lab9task1
{
    public static void main(String[] args)
    {
        int[] a= new int[5];        
        Scanner KB=new Scanner(System.in);
        System.out.println("Please enter a number");
        int b=KB.nextInt();
        int largest=b;
        
        for(int count=0; count<4; count++)
        {
            System.out.println("Please enter a number");
            a[count]=KB.nextInt();
            
            if(a[count]>=largest)
            {
                largest=a[count];
            }
        }
        System.out.println(largest);
    }
}

