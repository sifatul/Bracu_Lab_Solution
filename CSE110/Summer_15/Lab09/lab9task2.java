/*Write a program which reads 5 numbers into an
 *array and prints the largest number and its
 *location in the array.If the user enters
 * 7, 13, 2, 10, 6 then your program should 
 *print “largest number 13 was found at location 1”.
*/

import java.util.Scanner;
public class lab9task2
{
    public static void main(String[] args)
    {
        int[] a= new int[5];        
        int location=0;
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
                location=count+1;
            }
        }
        System.out.println("Largest number "+largest+" was found at location "+location);
    }
}

