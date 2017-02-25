/*) Triangle - Isosceles
Draw triangle of given height
Sample input 1:
3
Sample output 1:
  1
 123
12345

Sample input 2:
4
Sample output 2:
   1
  123
 12345
1234567
*/
import java.util.Scanner;
public class lab7p10
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
            
            for(int i=1; i<=(2*j-1); i++)
            {
                System.out.print(i);
            }
                       
            System.out.println();
        }
        
        
    }
}