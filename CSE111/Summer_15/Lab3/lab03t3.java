/*
There are two ways to print ASCII code / Unicode / int value of each character.
String s = “Bye”;
Either,
1) char ch = s.charAt(0);
int codeForCh = (int) ch;
System.out.println(codeForCh); // this line would print 66 which is the code for character B
Or, 
2) int codeForCh = s.codePointAt(0);
System.out.println(codeForCh); // this line would print 66 which is the code for the character B

Now your task is to input a word into a String. Then print code for each character in the String using the 2nd method discussed above. Use any means necessary.
To check if your program is working correctly or not, you can find a list of all correct values from the following website. Look at “Dec” and “Char” columns only, ignore Hex column.
http://www.cdrummond.qc.ca/cegep/informat/Professeurs/Alain/files/ascii.htm 

Sample input 1:
Programming
Sample output 1:
P : 80
r : 114
o : 111
g : 103
r : 114
a : 97
m : 109
m : 109
i : 105
n : 110
g : 103

Sample input 2:
hunger
Sample output 2:
h : 104
u : 117
n : 110
g : 103
e : 101
r : 114
*/
import java.util.*;
import static java.lang.System.*;

public class lab03t3
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
            char ch = s.charAt(i);
            int codeForCh = (int) ch;
            char aChar=s.charAt(i);
            out.println(aChar+":"+codeForCh);
            i++;
        }
    }
}