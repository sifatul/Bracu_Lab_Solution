//Q. Input second and output in hours+minutes+seconds

import java.util.Scanner;
public class Task
{
    public static void main (String[] args)
    {
        Scanner KB=new Scanner (System.in);
        
        int second, minute, hour, sec;
        
        System.out.println ("Enter time in seconds");
        sec=KB.nextInt();
        
        hour=(sec/3600);
        minute=((sec%3600)/60);
        second=((sec%3600)%60);
        
        
        System.out.println(hour+" Hours");
        System.out.println(minute+" Minutes");
        System.out.println(second+" Seconds");
     }

}    