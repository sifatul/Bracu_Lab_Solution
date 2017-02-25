/*Write a Java program which adds all numbers
 * that are multiples of either 7 or 9 up to 600.
 * Ensure that numbers like 63 are added only once in the sum.
 * */
public class task11
{
    public static void main(String[] args)
    {
        int count=0;
        int num=1;
        int sum1=0;
        int sum2=0;
        int sum=0;
        
        while(num<=600)
        {
            if(num%7==0)
            {                
                if(num%9!=0)
                {
                    sum1=sum1+num;
                }
            }
            
            else if(num%9==0)
            {
                sum2=sum2+num;               
            }
                                    
            count=count+1;
            num=num+1;
        }
        
        sum=sum1+sum2;
        System.out.println("Sum="+sum);
    }
}




