/*Imagine user will give you some numbers, say 8 numbers. 
 All numbers are between 2 and 4. One program to count these 
numbers may be:
Scanner sc=new Scanner(System.in);
int[] statistics=new int[5];
int i, n;
System.out.println("enter total eight numbers between 2 and 4 only, otherwise I will have to make my array larger.");
for(i=0;i<=7;++i){
n=sc.nextInt();
statistics[n]=statistics[n]+1;
}
for(i=2;i<=4;++i){
System.out.println(i+" was found "+ statistics[i]+ " times");        
}
/*
If the user enters 2, 4, 3, 4, 4, 2, 2, 2. The program above will print:
2 was found 4 times
3 was found 1 times
4 was found 3 times

Also note that we have left index 0 and index 1 unused as we do 
not need those. We only need to count numbers between 2 and 4.

If you looked closely at the website mentioned in Task3, you
must have realized that all codes are between 0 and 255.  
Taking help of the example shown above, print the statistics of 
occurrence of each character on a line by itself. Assume that 
user will only give CAPITAL letters. So you will have to count
values of CAPITAL letters only.

Sample input 1:
BANGLADESH
SAMPLE output 1:
A which is 65 was found 2 times
B which is 66 was found 1 times
C which is 67 was found 0 times
D which is 68 was found 1 times
E which is 69 was found 1 times
F which is 70 was found 0 times
G which is 71 was found 1 times
H which is 72 was found 1 times
I which is 73 was found 0 times
J which is 74 was found 0 times
K which is 75 was found 0 times
L which is 76 was found 1 times
M which is 77 was found 0 times
N which is 78 was found 1 times
O which is 79 was found 0 times
P which is 80 was found 0 times
Q which is 81 was found 0 times
R which is 82 was found 0 times
S which is 83 was found 1 times
T which is 84 was found 0 times
U which is 85 was found 0 times
V which is 86 was found 0 times
W which is 87 was found 0 times
X which is 88 was found 0 times
Y which is 89 was found 0 times
Z which is 90 was found 0 times
*/
import java.util.*;
import static java.lang.System.*;

public class lab03t4
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(in);
        String s=new String();
        int[] count=new int[91];
        out.println("Enter word");
        s=KB.next();
        
        int a,b,c;
        b=0;
        
        for(a=0;a<s.length();a++)
        {
            char ch=s.charAt(b);
            b++;
            c=(int) ch;
            count[c]=count[c]+1;
        }
        for(int i=65;i<=90;i++)
        {
            char ch=(char) i;
            out.println(ch+" which is "+i+" was found "+count[i]+" times");
        }
    }
}
        
        
        
        
        