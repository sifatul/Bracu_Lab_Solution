// Loop basic use
import static java.lang.System.*;
import java.util.*;

public class loop
{
    public static void main(String[] args)
    {
        //java.util.Scanner sc=new java.util.Scanner(in);
        Scanner sc=new Scanner(in);
        out.print("Please type last value");
        int last=sc.nextInt();
        int count=1; //initialization
        
        while(count<=last) //condition
        {
            out.print(count+" "); //work
            count++; //counter change / increment / decrement
        }
    }
}
