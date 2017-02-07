//Write a java program that prints the 
// following sequences of values using loops:
//b) -10, -5, 0, 5, 10, 15, 20
public class task9b
{
    public static void main(String[] args)
    {
        int term=-10;
        while(term<=20)
        {   
         System.out.print(term+" ");
         term=(term+5);        
        } 
    }
}    