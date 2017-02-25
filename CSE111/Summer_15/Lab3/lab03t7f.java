//7f) equalsIgnoreCase
import static java.lang.System.*;
public class lab03t7f
{
    public static void main(String[] args)
    {
        String Str1 = new String("Hello World!");
        String Str2 = Str1;
        String Str3 = new String("Hello World!");
        String Str4 = new String("HELLO WORLD!");
        boolean retVal;
        
        retVal = Str1.equals( Str2 );
        System.out.println("Returned Value = " + retVal );
        
        retVal = Str1.equals( Str3 );
        System.out.println("Returned Value = " + retVal );
        
        retVal = Str1.equalsIgnoreCase( Str4 );
        System.out.println("Returned Value = " + retVal );
    }
}