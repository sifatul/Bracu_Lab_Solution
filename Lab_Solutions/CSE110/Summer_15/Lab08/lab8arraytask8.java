/*Write a java program that reads 10 numbers 
 * from the user, and then
 * prints only the even numbers in reverse order.*/

import java.util.Scanner;
public class lab8arraytask8
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

