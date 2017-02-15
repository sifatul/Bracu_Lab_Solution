/*Input a word into a String. Print the length of the word, that is, how many characters / symbols / spaces are there. Take help from: 
ONLY First 4 lines of “String Length” paragraph from 
http://download.oracle.com/javase/tutorial/java/data/strings.html
http://download.oracle.com/javase/7/docs/api/java/lang/String.html#length%28%29


Sample input 1:
Programming
Sample output 1:
11

Sample input 2:
hunger
Sample output 2:
6
*/
import java.util.*;
import static java.lang.System.*;

public class lab03t1
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(in);
        String s=new String();
        out.println("Enter word");
        s=KB.next();
        
        int i=s.length();
        
        out.println(i);
    }
}