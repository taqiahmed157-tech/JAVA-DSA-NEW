package com.taqi;
import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=in.nextInt();
        System.out.println(prime(n));
    }
    static boolean prime(int n)
    {
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
