/*Write a java program that reads five numbers
 * as input from the user, 
 * and prints whether the numbers are odd or even.
 * */

import java.util.Scanner;
public class task1
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(System.in);
        int count=0;
        
        while(count<5)
        {
            System.out.println("Please enter a number");
            int num=KB.nextInt();
            
            if(num%2==0)
            {
                System.out.println(num+" is even");
                count=count+1;
            }
            
            else
            {
                System.out.println(num+" is odd");
                count=count+1;
            }    
            
        }
        
    }
}    