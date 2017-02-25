//Write a Java program which adds all numbers that are
//multiples of either 7 or 9 but not both, up to 600.
public class task12
{
    public static void main(String[] args)
    {
        int count=0;
        int num=1;
        int sum1=0;
        int sum2=0;
        int sum3=0;
        int sum=0;
        
        while(num<=600)
        {
            if(num%7==0)
            {
                if(num%9==0)
                {
                    sum3=sum3+num;
                }
                
                else
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
        
        sum=sum1+sum2-sum3;
        System.out.println("Sum="+sum);
    }
}




