/*Triangle - Right Justified
Draw right angled triangle of given height
Sample input:
4
Sample output
   1
  12
 123
1234

*/
import java.util.Scanner;
public class lab7p8
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(System.in);
        System.out.println("Enter a number");
        int m=KB.nextInt();
        
        
        for(int j=1; j<=m; j++)
        {
            
            for(int k=1; k<=(m-j); k++)
            {
                System.out.print(" ");
            }
            
            
            for(int i=1; i<=j; i++)
            {
                System.out.print(i);
            }
            
            System.out.println();
        }
        
        
    }
}