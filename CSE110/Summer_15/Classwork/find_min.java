//Q. Input 5 numbers, find the min

import static java.lang.System.*;
import java.util.*;

public class task1b
{
    public static void main(String[] args)
    {
        int num;
        int min;
        Scanner KB=new Scanner(in);        
        
        out.println("Enter a number");
        num=KB.nextInt();
        min=num;
        
        for(int c=0;c<4;c++)
        {
            out.println("Enter a number");
            num=KB.nextInt();
            
            if(num<min)
            {
                min=num;            
            }
        }
        
        out.println("Min="+min);
    }
}