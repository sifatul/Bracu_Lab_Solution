/*Change the following System.out.println() 
 * to a System.out.printf() method.
Current output: 5.984807753012208
Desired output after the change: 5.9848

double z;
z = 5+ Math.sin(80*Math.PI/180);
System.out.println(z); 

 * */

public class lab9task10
{
    public static void main(String[] args)
    {
        double z;
        z = 5+ Math.sin(80*Math.PI/180);
        System.out.printf("%.4f", z);
        System.out.println();
    }
}

