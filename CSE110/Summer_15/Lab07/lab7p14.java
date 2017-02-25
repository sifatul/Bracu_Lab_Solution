/*Hollow Rectangle 
Display a rectangle of given length and width. 
Sample input:
4
5
Sample output
*****
*   *
*   *
*****

Hint 1: Print the character space (‘   ‘)  in the middle.
Hint 2: You can re-use your solution to PROBLEM 2 and use if condition to selectively print first and last star of each line and all stars of first and last line.
*/
import java.util.Scanner;
public class lab7p14
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(System.in);
        System.out.println("Enter a number");
        int m=KB.nextInt();
        System.out.println("Enter another number");
        int n=KB.nextInt();        
        
        
        for(int j=1; j<=m; j++)
        {
            for(int i=1; i<=n; i++)
            {
                if(j==1||i==1||j==m||i==n)
                {
                    System.out.print("*");             
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        
    }
}