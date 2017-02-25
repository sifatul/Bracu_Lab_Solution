/* Write a java program that prints the 
 * following sequences of values using loops:
 d) 2, -4, 6, -8, 10, -12
 */
public class task9d
{
    public static void main(String[] args)
    {
        int term=2;
        int count=0;
        int num=0;
        System.out.print(term+" ");
        while(num>-12)
        {
          term=term+2;
          
          if(count%2==0)
          {
              num=term*-1;
              System.out.print(num+" ");
              count=count+1;
          }
          
          else
          {    
              System.out.print(term+" ");
              count=count+1;
          }    
              
        }
    }
}    