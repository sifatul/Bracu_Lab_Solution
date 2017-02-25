/*Rectangle 
Sample input:
4
6
Sample output
******
******
******
******
*/
import java.util.Scanner;
public class lab7p3
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(System.in);
        System.out.println("Enter a number");
        int m=KB.nextInt();
        System.out.println("Enter another number");
        int n=KB.nextInt();        
        
        
        for(int outerloop=1; outerloop<=m; outerloop++)
        {
            for(int innerloop=1; innerloop<=n; innerloop++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        
    }
}