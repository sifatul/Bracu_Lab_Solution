//Write a java program that prints the 
//following sequences of values using loops:
//a) 24, 18, 12, 6, 0, -6
public class task9a
{
    public static void main(String[] args)
    {
        int term=24;
        while(term>=-6)
        {   
         System.out.print(term+" ");
         term=(term-6);        
        } 
    }
}    