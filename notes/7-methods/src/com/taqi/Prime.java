package com.taqi;
import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=in.nextInt();
        if(isPrime(n))
        {
            System.out.println(n+" is prime");
        }
        else
        {
            System.out.println(n+" is not prime");
        }
    }
    static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        else
        {
            int i=2;
            while(i*i<=n)
            {
                if(n%i==0)
                    return false;
                i++;
            }
            return true;
        }
    }



}
