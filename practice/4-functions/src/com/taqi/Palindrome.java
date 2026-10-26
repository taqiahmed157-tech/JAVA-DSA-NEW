package com.taqi;
import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=in.nextInt();
        isPalindrome(n);
    }
    static void isPalindrome(int n)
    {
        int num=n;
        int rev=0;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(num==rev)
        {
            System.out.println(num+" is palindrome");
        }
        else
        {
            System.out.println(num+" is not a palindrome");
        }
    }
}
