//Use of different string tokenizer
import java.util.*;
public class Task03{
    public static void main(String[]args)
    {
        
        String someNumbers = "74.5                89          \n    45";
        Scanner k = new Scanner(someNumbers);
        while(k.hasNextDouble())
        {
            System.out.println(k.nextDouble());
        }
        
        String shortStory = "still you can find some teachers who dislike such co-curricular \n"+"activities like Programming Contests. They do not understand contests are\n"+"far more interesting and challenging than whatever slides he was showing in the classroom.\n"+"To be a good contestant, one needs to be resourceful."+"Apart from a working brain, the primary resource for a contestant would be books.\n"+"And a good source of books and training materials is the Internet.";
        Scanner k2=new Scanner(shortStory);
        while(k2.hasNextLine())
        {
            System.out.println(k2.nextLine());
        }
        
        String s="23 3 8 20 32";
        int sum=0;
         //Code below adds the above numbers and prints sum.
        
        Scanner k3=new Scanner(s);
        while(k3.hasNextInt())
        {
            sum=sum+k3.nextInt();
        }
        System.out.println("Sum = "+sum);
        
        //Code below prints the string on the basis of tokenizer ';'
        String in = "title;" +"author;" + "publisher;" +"copyright;"; 
        
        StringTokenizer st = new StringTokenizer(in, ";"); 
        while(st.hasMoreTokens()) 
        { 
            String key = st.nextToken(); 
            System.out.println(key); 
        } 
        //Code below prints the string with an additional 
        //tab space on the basis of tokenizer '=;' 
        String in2 = "title=Java-Samples;" + 
            "author=Emiley J;" + 
            "publisher=java-samples.com;" + 
            "copyright=2007;"; 
        
        StringTokenizer st2 = new StringTokenizer(in2, "=;"); 
        while(st2.hasMoreTokens()) 
        { 
            String key = st2.nextToken(); 
            String val = st2.nextToken(); 
            System.out.println(key + "\t" + val); 
        } 
        //Code below splits the string based on regular expression '\\s'
        
        String speech = "Four score and seven years ago";
        String[] result = speech.split("\\s");
        for (int x=0; x<result.length; x++) 
        {
            System.out.println(result[x]);
        }
         //Code below splits the string based on regular expression ':'
        String s2 = "Alvin:Alexander:Talkeetna:Alaska";
        String[] result2 = s2.split(":");
        
        for (int x=0; x<result2.length; x++) 
        {
            System.out.println(result2[x]);
        }
    }
}



