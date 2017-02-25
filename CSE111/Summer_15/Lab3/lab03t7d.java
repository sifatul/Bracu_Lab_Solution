//7d) endsWith
import static java.lang.System.*;
public class lab03t7d
{
    public static void main(String[] args)
    {
        String Str = new String("Hello World!");
        boolean retVal;
        
        retVal = Str.endsWith("World!");
        out.println("Returned Value = " +retVal);
        
        retVal = Str.endsWith("World");
        out.println("Returned Value = " + retVal);
    }
}