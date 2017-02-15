/*(a) Change the following System.out.println()
 to a System.out.
 printf() method so that the output
 is 5.984808*/
import java.util.*;
import static java.lang.System.*;

public class lab02t1
{
    public static void main(String[] args)
    {
        double z;
        z = 5+ Math.sin(80*Math.PI/180);
        out.printf("%f",z);
        out.println();
    }
}