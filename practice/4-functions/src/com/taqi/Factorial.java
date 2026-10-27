// Q.Write a program to print factorial of a number.
package com.taqi;
import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=in.nextInt();
        System.out.println(n+"!="+factorial(n));
    }
    static int factorial(int n)
    {
        if(n==0 || n==1)
            return n;
        return n*factorial(n-1);
    }
}
