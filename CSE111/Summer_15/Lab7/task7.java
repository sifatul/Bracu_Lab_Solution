/*Using recursion:Print 10 to 1
 *N.B. Run the tester file for output
*/
public class task7
{
    public void printLoop(int num)
    {
        if(num==1)
        {
            System.out.println(num);
            return;
        }
        else
        {
            System.out.println(num);
            printLoop(num-1);
        }
    }
}
