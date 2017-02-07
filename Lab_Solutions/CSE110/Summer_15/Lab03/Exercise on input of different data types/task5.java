import java.util.Scanner;

public class task5
{
    public static void main(String[] args)
    {
        Scanner K=new Scanner(System.in);
        System.out.println("Please enter the radius of the circle");
        double radius=K.nextDouble();
        double area=3.14*radius*radius;
        double circumference=2*3.14*radius;
        System.out.println("Area="+area);
        System.out.println("Circumference="+circumference);
        
    }
    
}    