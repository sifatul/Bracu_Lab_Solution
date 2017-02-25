import java.util.Scanner;

public class task3
{
    public static void main(String[] args)
    {
        Scanner K=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1=K.nextInt();
        Scanner A=new Scanner(System.in);
        System.out.println("Please enter another number");
        int num2=A.nextInt();
        int sum=num1+num2;
        int product=num1*num2;
        int difference=num1-num2;
        System.out.println("Sum="+sum);
        System.out.println("Product="+product);
        System.out.println("Difference="+difference);
    }
    
}    