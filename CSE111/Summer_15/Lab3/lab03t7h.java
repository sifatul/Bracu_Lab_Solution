//7h) lastIndexOf
import static java.lang.System.*;
public class lab03t7h
{
    public static void main(String[] args)
    {
        String Str = new String("Hello World");
        String SubStr1 = new String("World");
        String SubStr2 = new String("Greetings");
        
        System.out.print("Found Last Index :" );
        System.out.println(Str.lastIndexOf( 'o' ));
        System.out.print("Found Last Index :" );
        System.out.println(Str.lastIndexOf( 'o', 5 ));
        System.out.print("Found Last Index :" );
        System.out.println(Str.lastIndexOf( SubStr1 ));
        System.out.print("Found Last Index :" );
        System.out.println(Str.lastIndexOf( SubStr1, 5 ));
        System.out.print("Found Last Index :" );
        System.out.println(Str.lastIndexOf( SubStr2 ));
    }
}