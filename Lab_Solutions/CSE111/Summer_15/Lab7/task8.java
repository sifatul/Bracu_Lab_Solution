/*Using recursion:24, 18, 12, 6, 0, -6
 *N.B. Run the tester file for output
*/
public class task8
{
    public void printLoop(int num)
    {
        if(num==-6)
        {
            System.out.println(num);
            return;
        }
        else
        {
            System.out.println(num);
            printLoop(num-6);
        }
    }
}
