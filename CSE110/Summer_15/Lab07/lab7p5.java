/* Triangle - Left Justified
Draw right angled triangle of given height
Sample input:
4
Sample output
*
**
***
****
*/
import java.util.Scanner;
public class lab7p5
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(System.in);
        System.out.println("Enter a number");
        int m=KB.nextInt();
              
        
        for(int j=1; j<=m; j++)
        {
            for(int i=1; i<=j; i++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        
    }
}