//Same as task 2 for 20 numbers

import java.util.Scanner;
public class task6
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(System.in);
        double sum=0;
        int count=0;
        double avg;
        while(count<20)
        {
            System.out.println("Please enter a number");
            int num=KB.nextInt();
            sum=sum+num;
            count=count+1;
        }
        avg=(sum/20);
        System.out.println("Average="+avg);
    }
}    