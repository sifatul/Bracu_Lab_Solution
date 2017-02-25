/*20 methods of string operation
 1. length()
 2.charAt()
 3.startsWith()
 4.endsWith()
 5.replaceFirst(char,char)
 6.replaceAll(char,char)
 7.replaceLast(char,char)
 8.toLowerCase()
 9.toUpperCase()
 10.equals()
 11.equalsIgnoreCase()
 12.compareTo()
 13.compareToIgnoreCase()
 14.substring(int)
 15.substring(int,int)
 16.indexOf(char)
 17.lastIndexOf(char)
 18.indexOf(char,int)
   [Take a String as input and then a character and
   a number as input. Check the string from location
   indicated by the integer value, and print the 
   location of the first occurrence of the character. 
   If not found, print -1. ]

19.lastIndexOf(char,start)
  [Take a String as input and then a character and
  a number as input. Check the string from location
  indicated by the integer value, and print the 
  location of the last occurrence of the character.
  If not found, print -1.]
  
20.concat() 
  [Take two strings as input and create a new 
  character array that contains all characters
  of the first String followed by all characters
  of the second string. Print the new array and
  verify. ]
 */

//N.B.You need to uncomment the commented section from 
//the main method below to test out different methods. 

import java.util.*;
import static java.lang.System.*;

public class StringMethodsTest
{ 
    String s; 
    
    public StringMethodsTest(String s)
    { 
        this.s=s; 
    } 
    
    public static void main (String[]args)
    { 
        Scanner KB = new Scanner(in);
        out.println("Enter String");
        String st1 = KB.next();
        StringMethodsTest s1 = new StringMethodsTest(st1); 
        
        /*out.println("String length is "+s1.length());
          
         out.println("Enter index number");
         int index = KB.nextInt();
         out.println("The char at "+index+" is "+s1.charAt(index));
         
         out.println("Enter String");
         String st2 = KB.next();
         out.println(s1.startsWith(st2));
         out.println(s1.endsWith(st2));
         
         out.println("Enter old char");
         char oldc = KB.next().charAt(0);
         out.println("Enter new char");
         char newc = KB.next().charAt(0);
         s1.replaceFirst(oldc,newc);
         
         out.println("Enter old char");
         char oldc = KB.next().charAt(0);
         out.println("Enter new char");
         char newc = KB.next().charAt(0);
         s1.replaceAll(oldc,newc);
         
         out.println("Enter old char");
         char oldc = KB.next().charAt(0);
         out.println("Enter new char");
         char newc = KB.next().charAt(0);
         s1.replaceLast(oldc,newc);
         
         s1.toLowerCase(st1);
         
         s1.toUpperCase(st1);
         
         out.println("Enter another String");
         String st2 = KB.next();
         out.println(s1.equals(st2));
         
         out.println("Enter another String");
         String st2 = KB.next();
         out.println(s1.equalsIgnoreCase(st2));
         
         out.println("Enter another String");
         String st2 = KB.next();
         s1.compareTo(st2);
         
         out.println("Enter another String");
         String st2 = KB.next();
         s1.compareToIgnoreCase(st2);
         
         out.println("Enter starting point");
         int input = KB.nextInt();
         if(input<0||input>s1.length()-1)
         {
         out.println("Invalid starting point");
         }
         
         else
         {
         int start = input;
         s1.substring(start);  
         }
         
         
         out.println("Enter starting point");
         int input1 = KB.nextInt();
         if(input1>=0&&input1<s1.length()-1)
         {
         int start = input1;
         out.println("Enter ending point");
         int end = KB.nextInt();
         
         s1.substring(start,end);
         }
         else
         {
         out.println("Invalid starting point");
         }
         
         out.println("Enter char");
         char c = KB.next().charAt(0);
         s1.indexOf(c);
         
         out.println("Enter char");
         char c = KB.next().charAt(0);
         s1.lastIndexOf(c);
        
        out.println("Enter char");
        char c = KB.next().charAt(0);
        out.println("Enter starting point");
        int start = KB.nextInt();
        s1.indexOf(c,start);
        
        out.println("Enter char");
        char c = KB.next().charAt(0);
        out.println("Enter starting point");
        int start = KB.nextInt();
        s1.lastIndexOf(c,start);*/
        
        out.println("Enter another string");
        String st2 = KB.next();
        s1.concat(st2);
        
    }
    
    public int length()
    { 
        char[] a = s.toCharArray();
        int count = 0;
        
        for(int i=0;i<a.length;i++)
        {
            count++;   
        }
        return count;
    }
    
    public char charAt(int n)
    {
        char[] a = s.toCharArray();
        if(n<0||n>=a.length)
        {
            out.println("invalid index");
            return ' ';
        }
        else
            return a[n];
    }
    
    public boolean startsWith(String st2)
    {
        char[] a = s.toCharArray();
        char[] b = st2.toCharArray();
        
        if(b.length==0)
        {
            return true;
        }
        
        else if(b.length>a.length)
        {
            return false;
        }
        
        for(int i=0;i<b.length;i++)
        {
            
            if(b[i]!=a[i])
            {
                return false;
            }
        }
        return true;
    }
    
    public boolean endsWith(String st2)
    {
        char[] a = s.toCharArray();
        char[] b = st2.toCharArray();
        
        if(b.length==0)
        {
            return true;
        }
        
        else if(b.length>a.length)
        {
            return false;
        }
        
        int j = a.length-1;
        for(int i=b.length-1;i>=0;i--)
        {
            
            if(a[j]!=b[i])
            {
                return false;
            }
            j--;
        }
        return true;
    }
    
    public void replaceFirst(char oldc, char newc)
    {
        char[] a = s.toCharArray();
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==oldc)
            {
                a[i]=newc;
                break;
            }
        }
        
        out.println("Replaced String: ");
        for(int i=0;i<a.length;i++)
        {
            out.print(a[i]);
        }
    }
    
    public void replaceAll(char oldc, char newc)
    {
        char[] a = s.toCharArray();
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==oldc)
            {
                a[i]=newc;
            }
        }
        
        out.println("Replaced String: ");
        for(int i=0;i<a.length;i++)
        {
            out.print(a[i]);
        }
    }
    
    public void replaceLast(char oldc, char newc)
    {
        char[] a = s.toCharArray();
        
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]==oldc)
            {
                a[i]=newc;
                break;
            }
        }
        
        out.println("Replaced String: ");
        for(int i=0;i<a.length;i++)
        {
            out.print(a[i]);
        }
    }
    
    public void toLowerCase(String st1)
    {
        char[] a = s.toCharArray();
        
        for(int i=0;i<a.length;i++)
        {
            if((int)a[i]>=65&&(int)a[i]<=90)
            {
                a[i]=(char)((int)a[i]+32);
            }
        }
        
        for(int i=0;i<a.length;i++)
        {
            out.print(a[i]);
        }
    }
    
    public void toUpperCase(String st1)
    {
        char[] a = s.toCharArray();
        
        for(int i=0;i<a.length;i++)
        {
            if((int)a[i]>=97&&(int)a[i]<=122)
            {
                a[i]=(char)((int)a[i]-32);
            }
        }
        
        for(int i=0;i<a.length;i++)
        {
            out.print(a[i]);
        }
    }
    
    public boolean equals(String st2)
    {
        char[] a = s.toCharArray();
        char[] b = st2.toCharArray();
        
        if(b.length==a.length)
        {
            for(int i=0;i<b.length;i++)
            {
                if(b[i]!=a[i])
                {
                    return false;
                }
            }
            return true;
        }
        
        else
            return false;  
    }
    
    public boolean equalsIgnoreCase(String st2)
    {
        char[] a = s.toCharArray();
        char[] b = st2.toCharArray();
        
        if(b.length==a.length)
        {
            for(int i=0;i<a.length;i++)
            {
                if((int)a[i]>=65&&(int)a[i]<=90)
                {
                    a[i]=(char)((int)a[i]+32);
                }
            }
            
            for(int i=0;i<b.length;i++)
            {
                if((int)b[i]>=65&&(int)b[i]<=90)
                {
                    b[i]=(char)((int)b[i]+32);
                }
            }
            
            for(int i=0;i<b.length;i++)
            {
                if(b[i]!=a[i])
                {
                    return false;
                }
            }
            return true;
        }
        
        else
            return false;  
    }
    
    public void compareTo(String st2)
    {
        char[] a = s.toCharArray();
        char[] b = st2.toCharArray();
        
        int value=0;
        
        if(a.length!=b.length)
        {
            out.println("String length not equal");
        }
        
        else
        {
            for(int i=0;i<a.length;i++)
            {
                value = (int)a[i]-(int)b[i];
                
                if(value!=0)
                {
                    out.println(value);
                    break;
                }
            }
            if(value==0)
            {
                out.println(value);
            }
        }
    }
    
    public void compareToIgnoreCase(String st2)
    {
        char[] a = s.toCharArray();
        char[] b = st2.toCharArray();
        
        int value=0;
        
        if(a.length!=b.length)
        {
            out.println("String length not equal");
        }
        
        for(int i=0;i<a.length;i++)
        {
            if((int)a[i]>=65&&(int)a[i]<=90)
            {
                a[i]=(char)((int)a[i]+32);
            }
        }
        
        for(int i=0;i<b.length;i++)
        {
            if((int)b[i]>=65&&(int)b[i]<=90)
            {
                b[i]=(char)((int)b[i]+32);
            }
        }
        
        if(a.length==b.length)
        {
            for(int i=0;i<a.length;i++)
            {
                value = (int)a[i]-(int)b[i];
                
                if(value!=0)
                {
                    out.println(value);
                    break;
                }
            }
            if(value==0)
            {
                out.println(value);
            }
        }
    }
    
    public void substring(int start)
    {
        char[] a = s.toCharArray();
        
        for(int i=start;i<a.length;i++)
        {
            out.print(a[i]);
        }
    }
    
    public void substring(int start,int end)
    {
        char[] a = s.toCharArray();
        
        if(end<start||end>a.length-1)
        {
            out.println("Invalid ending point");
        }
        
        else
        {
            for(int i=start;i<=end;i++)
            {
                out.print(a[i]);
            }
        }
    }
    
    public void indexOf(char c)
    {
        char[] a = s.toCharArray();
        int count = 0;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==c)
            {
                out.println(i);
                count++;
                break;
            }
        }
        
        if(count==0)
        {
            out.println(-1);
        }
    }
    
    public void lastIndexOf(char c)
    {
        char[] a = s.toCharArray();
        int count = 0;
        
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]==c)
            {
                out.println(i);
                count++;
                break;
            }
        }
        
        if(count==0)
        {
            out.println(-1);
        }
    }
    
    public void indexOf(char c,int start)
    {
        char[] a = s.toCharArray();
        int count = 0;
        
        if(start>=0&&start<a.length)
        {
            
            for(int i=start;i<a.length;i++)
            {
                if(a[i]==c)
                {
                    out.println(i);
                    count++;
                    break;
                }
            }
            
            if(count==0)
            {
                out.println(-1);
            }
        }
        
        else
        {
            out.println("Invalid starting point");
        }
    }
    
    public void lastIndexOf(char c,int start)
    {
        char[] a = s.toCharArray();
        int count = 0;
        
        if(start>=0&&start<a.length)
        {
            
            for(int i=a.length-1;i>=0;i--)
            {
                if(a[i]==c)
                {
                    out.println(i);
                    count++;
                    break;
                }
            }
            
            if(count==0)
            {
                out.println(-1);
            }
        }
        
        else
        {
            out.println("Invalid starting point");
        }
    }
    
    public void concat(String st2)
    {
        char[] a = s.toCharArray();
        char[] b = st2.toCharArray();
        char[] c = new char[a.length+b.length];
        
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        
        int j=0;
        
        for(int i=a.length;i<c.length;i++)
        {
            c[i]=b[j];
            j++;
        }
        
        for(int i=0;i<c.length;i++)
        {
            out.print(c[i]);
        }
    }    
}




