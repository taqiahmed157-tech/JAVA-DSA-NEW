// Q. Calculate power program.
package com.taqi;
import java.util.Scanner;
public class Power
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int base,exp;
        System.out.print("Enter base : ");
        base=in.nextInt();
        System.out.print("Enter exponent : ");
        exp=in.nextInt();
        int value=1;
        for(int i=1;i<=exp;i++)
        {
            value=value*base;
        }

        System.out.println("The value of "+base+"^"+exp+" :"+value);

    }
}
