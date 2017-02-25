/*Change the following System.out.println()
 to a System.out.printf() method so that the 
 output is 5.9848 instead of 5.984807753012208

double z;
z = 5+ Math.sin(80*Math.PI/180);
System.out.println(z);
*/
import java.util.*;
import static java.lang.System.*;

public class lab02t1b
{
    public static void main(String[] args)
    {
        double z;
        z = 5+ Math.sin(80*Math.PI/180);
        out.printf("%.4f",z);
        out.println();
    }
}