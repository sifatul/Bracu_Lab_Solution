//Task 2 tester
import java.util.Scanner;
public class StudentTester
{
    public static void main(String[]args)
    {
        Scanner k=new Scanner(System.in);
        
        Student john=new Student();
        
        System.out.println("Enter a name");
        String name1=k.next();
        john.setName(name1);
        String n=john.getName();
        
        System.out.println("Enter an ID");
        String ID1=k.next();
        john.setID(ID1);
        String id=john.getID();
        
        System.out.println("Enter an Address");
        String address1=k.next();
        john.setAddress(address1);
        String a=john.getAddress();
        
        System.out.println("Enter CGPA");
        double cgpa1=k.nextDouble();
        john.setCGPA(cgpa1);
        double c=john.getCGPA();
        
        System.out.println(n);
        System.out.println(id);
        System.out.println(a);
        System.out.println(c);
        
        Student mike=new Student();
        
        System.out.println("Enter a name");
        String name2=k.next();
        mike.setName(name2);
        n=mike.getName();
        
        System.out.println("Enter an ID");
        String ID2=k.next();
        mike.setID(ID2);
        id=mike.getID();
        
        System.out.println("Enter an Address");
        String address2=k.next();
        mike.setAddress(address2);
        a=mike.getAddress();
        
        System.out.println("Enter CGPA");
        double cgpa2=k.nextDouble();
        mike.setCGPA(cgpa2);
        c=mike.getCGPA();
        
        System.out.println(n);
        System.out.println(id);
        System.out.println(a);
        System.out.println(c);
        
        Student carol=new Student();
        
        System.out.println("Enter a name");
        String name3=k.next();
        carol.setName(name3);
        n=carol.getName();
        
        System.out.println("Enter an ID");
        String ID3=k.next();
        carol.setID(ID3);
        id=carol.getID();
        
        System.out.println("Enter an Address");
        String address3=k.next();
        carol.setAddress(address3);
        a=carol.getAddress();
        
        System.out.println("Enter CGPA");
        double cgpa3=k.nextDouble();
        carol.setCGPA(cgpa3);
        c=carol.getCGPA();
        
        System.out.println(n);
        System.out.println(id);
        System.out.println(a);
        System.out.println(c);
    }
}


