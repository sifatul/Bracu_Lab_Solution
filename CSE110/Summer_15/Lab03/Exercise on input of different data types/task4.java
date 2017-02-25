import java.util.Scanner;

public class task4
{
    public static void main(String[] args)
    {
        Scanner K=new Scanner(System.in);
        System.out.println("Please enter a number");
        float num1=K.nextFloat();
        Scanner A=new Scanner(System.in);
        System.out.println("Please enter another number");
        float num2=A.nextFloat();
        float sum=num1+num2;
        float product=num1*num2;
        float difference=num1-num2;
        System.out.println("Sum="+sum);
        System.out.println("Product="+product);
        System.out.println("Difference="+difference);
    }
    
}    