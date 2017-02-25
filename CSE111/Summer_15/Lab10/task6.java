import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class task6
{
    public static void main(String[] args)
    {
        double sum = 0;
        String location = "/home/likewise-open/BRACU/15301119/a";
        try
        {
            Scanner KB = new Scanner(new File(location));
            while(KB.hasNextInt())
            {
                sum = sum+KB.nextInt();
            }
        }
        catch(Exception e)
        {
            out.println(e);
        }
        out.println((int)sum);
    }
}
               
        