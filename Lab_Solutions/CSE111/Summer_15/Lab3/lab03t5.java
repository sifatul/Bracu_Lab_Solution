/*Input a word into a String. 
Print the word.
Print the word again after adding “==THE END==” at the end of the word.
Then print the word again. 
Your whole program may contain the word “String” at most two times.
You are NOT allowed to use concat method. 
You ARE allowed use ‘+’ operator to concatenate (join?) words. 

Take help from: 
http://www.java2novice.com/java_string_examples/concat/
http://www.codingdiary.com/developers/developers/diary/javaapi/java/lang/SampleCode/ConcatStringExampleCode.html
http://www.java-samples.com/showtutorial.php?tutorialid=217
http://www.tutorialspoint.com/java/java_string_concat.htm
 “Concatenating Strings” paragraph from http://download.oracle.com/javase/tutorial/java/data/strings.html

Sample input 1:
Programming
Sample output 1:
Programming
Programming==THE END==
Programming

Sample input 2:
hunger
Sample output 2:
hunger
hunger==THE END==
hunger
*/
import java.util.*;
import static java.lang.System.*;

public class lab03t5
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(in);
        String s=new String();
        out.println("Enter word");
        s=KB.next();
        
        for(int i=1;i<=3;i++)
        {
            if(i==2)
            {
             out.println(s+"==THE END==");   
            }
            else
            out.println(s);
        }
    }
}