//Q. Give an input in 24 hours format 
//and convert it to 12 hour format  

import static java.lang.System.*;
import java.util.*;

public class timeconverter
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(in);
        out.print("Please type time");
        int hour=sc.nextInt();
        
        if(hour==0)
        {
            out.print("12 night");
        }
        else
        {
            if(hour<=11)
            {
                out.println(hour+" AM");
            }
            else
            {
                if(hour==12)
                {
                    out.println("12 noon");
                }
                else
                {
                    hour-=12;
                    out.println(hour+" PM");
                }
            }
        }
    }
}
