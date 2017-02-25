/*Create a String array (size 10) consisting of 
 * the words “zero”, “one”, “two”……, “nine”. 
 * Then take a number (between 0 and 9) from the
 * user and print that number in words from the
 * array. If the user enters 5, you should print
 * a[5] and output should be “five”.
 * */

import java.util.Scanner;
public class lab9task9
{
    public static void main(String[] args)
    {
        String[] a= {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Scanner KB=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=KB.nextInt();
        if(num>=0 && num<=9)
        {
            System.out.println(a[num]);
        }
    }
}
