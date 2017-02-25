/*Hollow Rectangle
Display a rectangle of given length and width. 
Sample input:
4
5
Sample output
12345
1   5
1   5
12345
*/
import java.util.Scanner;
public class lab7p15
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
                    System.out.print(i);             
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        
    }
}