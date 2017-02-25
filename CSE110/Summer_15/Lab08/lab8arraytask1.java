/* Write a java program that would input
 * three numbers from the user and print sum,
 * then the first number, then the 2nd number
 * followed by 3rd numberIf user enters 10, 20, 30. 
 * Then output should be 60, 10, 20, and 30.*/

import java.util.Scanner;
public class lab8arraytask1
{
    public static void main(String[] args)
    {
        int[] a= new int[3];
        int sum=0;
        
        for(int count=0; count<3; count++)
        {
            Scanner KB=new Scanner(System.in);
            System.out.println("Please enter a number");
            a[count]=KB.nextInt();
            sum=sum+a[count];
        }
        
        System.out.println(sum);
        
        for(int count=0; count<=2; count++)
        {
            System.out.println(a[count]);
        }
    }
}

        