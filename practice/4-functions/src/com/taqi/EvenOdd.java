package com.taqi;
import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=in.nextInt();
        evenodd(n);
    }
    static void evenodd(int n)
    {
        if(n%2==0)
            System.out.print(n+" is even");
        System.out.print(n+" is odd");

    }
}
