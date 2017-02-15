/*Using recursion:Print 1 to 10
 *N.B. Run the tester file for output
*/
public class task6
{
    public void printLoop(int num)
    {
        if(num==10)
        {
            System.out.println(num);
            return;
        }
        else
        {
            System.out.println(num);
            printLoop(num+1);
        }
    }
}
