//7g) indexOf
import static java.lang.System.*;
public class lab03t7g
{
    public static void main(String[] args)
    {
        String Str = new String("Hello World");
        String SubStr1 = new String("World");
        String SubStr2 = new String("Greetings");
        
        System.out.print("Found Index :" );
        System.out.println(Str.indexOf( 'o' ));
        System.out.print("Found Index :" );
        System.out.println(Str.indexOf( 'o', 5 ));
        System.out.print("Found Index :" );
        System.out.println(Str.indexOf( SubStr1 ));
        System.out.print("Found Index :" );
        System.out.println(Str.indexOf( SubStr1, 7 ));
        System.out.print("Found Index :" );
        System.out.println(Str.indexOf( SubStr2 ));
    }
}