/*
Given the following classes, write the code for
the BBAStudent class so that the following
output is printed when we run the TestStudent
class.

Name : Default BBA Student Department: BBA
Name : Humty Dumty Department: BBA
Name : Little Bo Peep Department: BBA

 */
public class TestStudent
{
    public static void printName(Student s)
    {
        System.out.println(s.toString());
    }
    public static void main(String [] args)
    {
        printName(new BBAStudent());
        printName(new BBAStudent("Humty Dumty"));
        printName(new BBAStudent("Little Bo Peep"));    
    }
}
