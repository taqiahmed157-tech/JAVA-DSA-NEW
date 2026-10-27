package com.taqi;
import java.util.Scanner;
public class Pythagorean
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the sides of the triangle : ");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        pythagorean(a,b,c);
        System.out.println();
    }
    static void pythagorean(int a,int b,int c)
    {
        int largest=0;
        if(a>=b && a>=c)
        {
            largest = a;
            b=b;
            c=c;
            a=0;
        }
        else if(b>=c && b>=a)
        {
            largest = b;
            a=a;
            c=c;
            b=0;
        }
        else
        {
            largest = c;
            a=a;
            b=b;
            c=0;
        }
        if(largest*largest==a*a+b*b+c*c)
        {
            System.out.println("pythagorean");
        }
        else
            System.out.println("not a pythagorean");

    }
}
