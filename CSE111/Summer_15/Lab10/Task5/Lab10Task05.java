// do not modify this file 
/*Change and complete the MyReader class so that
 *you can create your own exception 
 * ‘itsNotIntegerItsException’. There will be a
 * method int readInteger( ). This method will
 * take a String form the user. Then it will 
 * check if the number was ‘int’ or ‘float’ by 
 * checking presence of the decimal point in 
 * the input. It will throw an exception when a 
 * floating-point number is entered. Otherwise,
 * it will return the integer number.
 */
public class Lab10Task05
{ 
    public static void main(String[]args)
    { 
        MyReader m = new MyReader(); 
        int x; 
        try
        { 
            x=m.readInteger(); 
            System.out.println("Did it, User gave "+x); 
        }
        catch(itsNotIntegerItsException e)
        { 
            System.out.println("I failed "+e); 
        } 
    } 
}