//Q.Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package com.taqi;
import java.util.Scanner;
public class MaxAmong3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three numbers : ");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        System.out.println("Largest among "+a+", "+b+", and "+c+" is "+max(a,b,c));    }
    static int max(int a,int b,int c)
    {
        if(a>b && a>c)
            return a;
        else if(b>a && b>c)
            return b;
        return c;
    }
}
