//Write a java program that reads an integer, 
//and prints “The number is even” or “The number is odd”,
//depending on whether the number is even or odd.
// (Hint: use the modulus operator)
import java.util.Scanner;
public class Lab4Task6
{
    public static void main (String[] args)
    {
        Scanner KB=new Scanner (System.in);
        int a;
        System.out.println ("Enter a number");
        a=KB.nextInt();
       
        if (a%2==0)
        {
            System.out.println("the number is even");
        }
        else
        {
            System.out.println("the number is odd");
        }
    }
}    