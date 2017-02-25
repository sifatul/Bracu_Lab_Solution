//7j) replace(char oldChar, char newChar) 
import static java.lang.System.*;
public class lab03t7j
{
    public static void main(String[] args)
    {
        String Str = new String("Hello World");
        
        System.out.print("Return Value :" );
        System.out.println(Str.replace('l', 'P'));
        
        System.out.print("Return Value :" );
        System.out.println(Str.replace('o', 'a'));
    }
}