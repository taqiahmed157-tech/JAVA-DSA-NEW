package com.taqi;

import java.util.Scanner;

public class ReverseNum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to reverse it : ");
        int n=in.nextInt();//Input number
        int ans=0;// Initializing the answer to zero;
        while(n>0)
        {
            int rem;
            rem=n%10;// Taking remainder
            n=n/10;// Removing last digit
            ans=ans*10+rem;// Main Logic
        }
        System.out.println("Reversed number : "+ ans);

    }
}
