/*how examples of the following methods of the String class. 
 Try to  cover as several possible usages/example for each of these 
 methods.
7a) compareTo
*/
import static java.lang.System.*;
public class lab03t7a
{
    public static void main(String[] args)
    {
        String s1= "Buy";
        String s2= "Buy";
        String s3= "Bye";
        
        int result = s1.compareTo(s2);
        out.println(result);
        
        result = s2.compareTo(s3);
        out.println(result);
        
        result = s3.compareTo(s1);
        out.println(result);
    }
}
