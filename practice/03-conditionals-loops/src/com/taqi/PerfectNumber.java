package com.taqi;
import java.util.Scanner;
public class PerfectNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        int sum=0,i=1;
        while(i<n)
        {
            if (n % i == 0)
                sum = sum + i;
            i++;
        }
        if(sum==n)
            System.out.println(n+" is perfect number");
        else
            System.out.println(n+" is not a perfect number");
    }
}
