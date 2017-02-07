/*Write a java program that reads 10 numbers from the user, 
 * and then prints them in the reverse order.*/

import java.util.Scanner;
public class lab8arraytask3
{
    public static void main(String[] args)
    {
        int[] a= new int[10];
        
        for(int count=0; count<10; count++)
        {
            Scanner KB=new Scanner(System.in);
            System.out.println("Please enter a number");
            a[count]=KB.nextInt();
        }
        for(int count=0; count<=9; count++)
        {
            if(a[count]%2!=0)
            {
                System.out.println(a[count]);  
                break;
            }
        }
        
    }
}

