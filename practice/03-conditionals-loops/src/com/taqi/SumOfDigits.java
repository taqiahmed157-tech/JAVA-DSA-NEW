// Q. Write a program to find sum of digits of a number.
package com.taqi;
import java.util.Scanner;
public class SumOfDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=in.nextInt();
        int num=n,sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("Sum of digits of "+num+" : "+sum);
    }
}
