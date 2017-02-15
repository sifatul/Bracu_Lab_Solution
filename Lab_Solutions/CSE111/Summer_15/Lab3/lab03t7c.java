//7c) startsWith

import static java.lang.System.*;
public class lab03t7c
{
    public static void main(String[] args)
    {
      String Str = new String("Hello World");

      out.print("Return Value:");
      out.println(Str.startsWith("Hello"));

      out.print("Return Value:");
      out.println(Str.startsWith("World"));

      out.print("Return Value:");
      out.println(Str.startsWith("World",6));
        
    }
}