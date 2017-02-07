//Basic array input and print
import java.util.Scanner;
public class lab8arraytask
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
        for(int count=9; count>=0; count--)
        {
            System.out.println(a[count]);
        }
    }
}

        