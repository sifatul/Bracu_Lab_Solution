/*Input a word into a String. Print each character on a line by itself.  Use charAt method. Take help from: 
http://www.homeandlearn.co.uk/java/charAt.html
http://www.java2s.com/Code/Java/Language-Basics/StrCharAtshowStringcharAt.htm

Sample input 1:
Programming
Sample output 1:
P
r
o
g
r
a
m
m
i
n
g


Sample input 2:
hunger
Sample output 2:
h
u
n
g
e
r
*/
import java.util.*;
import static java.lang.System.*;

public class lab03t2
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(in);
        String s=new String();
        out.println("Enter word");
        s=KB.next();
        int i=0;
        
        while(i<=s.length()-1)
        {
            char aChar=s.charAt(i);
            out.println(aChar);
            i++;
        }
    }
}