/* Star Line
Print as many stars as given in input
Sample input:
6
Sample output
******
*/
import java.util.Scanner;
public class lab7p2
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=KB.nextInt();
        int count=1;
        
        while(count<=num)
        {
            System.out.print("*");
            ++count;
        }
        
        System.out.println();
    }
}

            