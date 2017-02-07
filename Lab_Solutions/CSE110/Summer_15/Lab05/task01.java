import java.util.Scanner;
public class task01
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(System.in);
        int sum=0;
        int count=0;
        int term=1;
        System.out.println("Please enter number of terms");
        int num=KB.nextInt();
       
        while(count<num)
        {            
            sum=sum+term;
            count=count+1;
            term=term+1;
        }
        System.out.println("Sum="+sum);
    }
}    