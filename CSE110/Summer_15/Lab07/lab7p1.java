/*Number Line
Sample input:
6
Sample output
123456
 * */

import java.util.Scanner;
public class lab7p1
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=KB.nextInt();
        int count=1;
        
        while(count<=num)
        {
            System.out.print(count);
            ++count;
        }
        
        System.out.println();
    }
}

            