//Q. Input 5 numbers, find the average

import static java.lang.System.*;
import java.util.*;

public class task1c
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(in);
        
        int num=0;
        int sum=0;
        int avg=0;
        
        for(int c=0;c<5;c++)
        {
            out.println("Enter a number");
            num=KB.nextInt();
            sum=sum+num;
        }
        avg=sum/5;
        out.println("Average="+avg);
    }
}