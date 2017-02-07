/*Triangle - Right Justified
Draw right angled triangle of given height
Sample input:
4
Sample output
   4
  34
 234
1234
*/
import java.util.Scanner;
public class lab7p11
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
            
            
            for(int i=(m-j+1); i<=m; i++)
            {
                System.out.print(i);
            }
            
            System.out.println();
        }
        
        
    }
}