//Task 4 with float numbers
import java.util.Scanner;
public class Lab4Task5_4
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
            float result;
            result=(a-b);
            System.out.println(result);
        }
        else if (a<b)
        {
            float result;
            result=(b-a);
            System.out.println(result);
        }    
    }
}    