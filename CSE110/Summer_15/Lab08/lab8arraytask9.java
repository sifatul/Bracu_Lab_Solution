/*Write a java program that reads 10 numbers from
 * the user. Then read another number from the user,
 * and print “yes” if this number 
 * exists among the first 10. Print “no” otherwise.
 * */
import java.util.Scanner;
public class lab8arraytask9
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

