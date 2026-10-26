// Q.Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
//4! = 1 * 2 * 3 * 4 = 24
package com.taqi;
import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {

        }
        System.out.println("4!= "+factorial(n));
    }
    static int factorial(int n)
    {
        if(n==0 || n==1)
            return n;
        return n*factorial(n-1);
    }
}
