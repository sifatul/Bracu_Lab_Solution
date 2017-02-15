//7e) equals
import static java.lang.System.*;
public class lab03t7e
{
    public static void main(String[] args)
    {
        String s1 = new String("Hello World!");
        String s2 = s1;
        String s3 = new String("Hello World!");
        boolean retVal;
        
        retVal = s1.equals( s2 );
        System.out.println("Returned Value = " + retVal );
        
        retVal = s1.equals( s3 );
        System.out.println("Returned Value = " + retVal );
    }
}