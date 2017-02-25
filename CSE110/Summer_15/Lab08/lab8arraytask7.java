/*Write a java program that reads 10 numbers from the 
*user and prints the last even number in the list.*/

import java.util.Scanner;
public class lab8arraytask7
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

