//7b) compareToIgnoreCase

import static java.lang.System.*;
public class lab03t7b
{
    public static void main(String[] args)
    {
        String s1= "Buy";
        String s2= "Buy";
        String s3= "Bye";
        
        int result = s1.compareToIgnoreCase(s2);
        out.println(result);
        
        result = s2.compareToIgnoreCase(s3);
        out.println(result);
        
        result = s3.compareToIgnoreCase(s1);
        out.println(result);
    }
}
