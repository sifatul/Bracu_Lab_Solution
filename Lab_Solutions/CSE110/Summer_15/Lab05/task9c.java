/*Write a java program that prints the 
 following sequences of values using loops:
 * c) 18, 27, 36, 45, 54, 63
 */
public class task9c
{
    public static void main(String[] args)
    {
        int term=18;
        while(term<=63)
        {   
         System.out.print(term+" ");
         term=(term+9);        
        } 
    }
}    