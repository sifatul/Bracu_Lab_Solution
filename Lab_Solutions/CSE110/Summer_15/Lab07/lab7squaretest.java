//Square matrix
import java.util.Scanner;
public class lab7squaretest
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(System.in);
        System.out.println("Enter a number");
        int m=KB.nextInt();
              
        
        for(int outerloop=1; outerloop<=m; outerloop++)
        {
            for(int innerloop=1; innerloop<=m; innerloop++)
            {
                System.out.print(innerloop);
            }
            
            System.out.println();
        }
        
        
    }
}