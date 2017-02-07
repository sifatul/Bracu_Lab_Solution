import java.util.Scanner;
public class SquareTester
{
    public static void main(String[]args)
    {
        Scanner k=new Scanner(System.in);
        
        Square s1=new Square();
        
        System.out.println("Enter height");
        double height1=k.nextDouble();
        s1.setHeight(height1);
        double h=s1.getHeight();
        
        System.out.println("Enter width");
        double width1=k.nextDouble();
        s1.setWidth(width1);
        double w=s1.getWidth();
        
        double a=s1.getArea();
        
        System.out.println("Height = "+ h); 
        System.out.println("Width = "+ w);
        System.out.println("Area = "+ a);
        
    }
}


