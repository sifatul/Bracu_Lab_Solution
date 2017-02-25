//Q.Task 3 with float numbers
import java.util.Scanner;
public class Lab4Task5_3
{
    public static void main (String[] args)
    {
        Scanner KB=new Scanner (System.in);
        float a, b;
        System.out.println ("Enter a number");
        a=KB.nextFloat();
        System.out.println ("Enter another number");
        b=KB.nextFloat();
        if (a>b)
        {
            System.out.println("first is greater");
        }
        else if (a<b)
        {
            System.out.println("second is greater");
        }
        else
        {
            System.out.println("the numbers are equal");
        }    
    }
}    