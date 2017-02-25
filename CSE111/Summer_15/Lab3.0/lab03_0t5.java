/*The current in an alternating current circuit that contains 
 * resistance, capacitance, and inductance in series is given by
 * 
 * I =E/{R^2+(2*Pi*f*L-1/2*pi*f*C)^2}^.5
 * 
 Where I=current (amperes), E=voltage (volts), R= resistance (ohms),
 L= inductance (henrys), C= capacitance (farads) and 
 f=frequency (hertz). Write a Java program that reads values for
 the voltage, resistance, inductance, capacitance and frequency,
 and then calculates and displays current.
*/
import java.util.*;
import static java.lang.System.*;

public class lab03_0t5
{
    public static void main(String[] args)
    {
        Scanner KB=new Scanner(in);
        
        double p=Math.PI;
        
        out.println("Enter voltage (E)");
        double E=KB.nextDouble();
        
        out.println("Enter resistance (R)");
        double R=KB.nextDouble();
       
        out.println("Enter frequency (f)");
        double f=KB.nextDouble();
        
        out.println("Enter inductance (L)");
        double L=KB.nextDouble();
        
        out.println("Enter capacitance (C)");
        double C=KB.nextDouble();
        
        double b=(2*p*f*L)-(1/(2*p*f*C));
        
        double a=(R*R)+(b*b);
        
        double r=Math.sqrt(a);
        
        double I=E/(r);
        
        out.println("Current (I)="+I);
    }
}