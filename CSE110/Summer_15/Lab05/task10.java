//Write a Java program which adds all numbers
//that are multiples of both 7 and 9 up to 600.
public class task10
{
    public static void main(String[] args)
    {
        int sum=0;
        int num=1;
        
        while(num<=600)
        {
            if(num%7==0)
            {
                if(num%9==0)
                {
                    sum=sum+num;
                }
                               
            }
            
            num=num+1;
        }
        System.out.println(sum);
    }
}
