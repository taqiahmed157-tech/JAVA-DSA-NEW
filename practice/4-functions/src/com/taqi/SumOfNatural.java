package com.taqi;
import java.util.Scanner;
public class SumOfNatural
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=in.nextInt();
        sum(n);
        System.out.println(sum(n));
    }
    static int sum(int n)
    {
        int total=0;
        for(int i=1;i<=n;i++)
        {
            total+=i;
        }
        return total;
    }
}
