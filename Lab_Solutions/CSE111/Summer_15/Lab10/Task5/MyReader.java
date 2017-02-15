import java.util.*; 
public class MyReader
{ 
    String s;
    Scanner k = new Scanner(System.in);
    String number;
    //modify following line so that this method can throw Exception 
    int readInteger() throws itsNotIntegerItsException
    {
        
        System.out.println("Enter a number");
        number = k.next();
        s = number;
        
        
        if (s.contains("."))
        { 
            throw new itsNotIntegerItsException();
        }
        else
        {     
           Scanner sc = new Scanner(number) ;
           int num = sc.nextInt();
           return num;
        }
        
    } 
}