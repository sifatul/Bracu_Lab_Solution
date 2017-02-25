//Task 1 with float numbers
import java.util.Scanner;
public class Lab4Task5_1
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
            System.out.println("first");
        }
        else
        {
            System.out.println("Not first");
        }
    }
}    