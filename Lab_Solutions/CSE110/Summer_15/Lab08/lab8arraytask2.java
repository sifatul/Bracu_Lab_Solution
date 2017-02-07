/*Write a java program that reads 10 numbers 
 * from the user. The program then reads a number
 * between 0 to 9, and shows the number at the 
 * corresponding index number. For instance,
 * if the array is a and the user enters 3, 
 * your program should print the value a[3].*/

import java.util.Scanner;
public class lab8arraytask2
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
        
        Scanner KB1=new Scanner(System.in);
        System.out.println("Please enter required array value");
        int array=KB1.nextInt();
        
        if(array>=0&&array<=9)
        {
            System.out.println(a[array]);
        }
    }
}

