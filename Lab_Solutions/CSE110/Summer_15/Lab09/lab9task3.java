/*Write a program which reads 5 numbers into an
array and prints the smallest and largest
number and their location in the array.
If the user enters 7, 13, -5, 10, 6 then your
program should print
“Smallest number -5 was found at location 2”.
“Largest number 13 was found at location 1”.
 */

import java.util.Scanner;
public class lab9task3
{
    public static void main(String[] args)
    {
        int[] a= new int[5];        
        int locationsmall=0;
        int locationlarge=0;
        Scanner KB=new Scanner(System.in);
        System.out.println("Please enter a number");
        int b=KB.nextInt();
        int smallest=b;
        int largest=b;
        
        for(int count=0; count<4; count++)
        {
            System.out.println("Please enter a number");
            a[count]=KB.nextInt();
            
            if(a[count]<=smallest)
            {
                smallest=a[count];
                locationsmall=count+1;
            }
            
            else if(a[count]>=largest)
            {
                largest=a[count];
                locationlarge=count+1;
            }
        }
        System.out.println("Smallest number "+smallest+" was found at location "+locationsmall);
        System.out.println("Largest number "+largest+" was found at location "+locationlarge);
    }
}

