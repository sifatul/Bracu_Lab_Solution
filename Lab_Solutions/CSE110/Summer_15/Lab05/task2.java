//Write a java program that reads five numbers from the user,
//and prints their average.
import java.util.Scanner;
public class task2
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(System.in);
        double sum=0;
        int count=0;
        double avg;
        while(count<5)
        {
            System.out.println("Please enter a number");
            int num=KB.nextInt();
            sum=sum+num;
            count=count+1;
        }
        avg=(sum/5);
        System.out.println("Average="+avg);
    }
}    