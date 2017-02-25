/*Write a java program that reads 15 numbers
 * from the user, all the numbers within the 
 * range 0-9. Then print the number of times
 * each number has been entered by the user.*/
import java.util.Scanner;
public class lab9task7
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(System.in);
        int[] a=new int[10];
        for(int i=0;i<15;i++)
        {
            System.out.println("Enter a number");
            int n=KB.nextInt();
            if(n>=0 && n<=9)
            {
                a[n]=a[n]+1;            
            }        
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(i+":"+a[i]);
        }
        System.out.println();
    }
}

                
            
                
            
        