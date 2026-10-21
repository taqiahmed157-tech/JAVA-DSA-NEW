package com.taqi;

import java.util.Scanner;

public class CountNums
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number to find Occurences of a digit : ");
        int n=in.nextInt();
        int num=n;//Storing for display that number since we are removing the digits in looping
        System.out.print("Enter the digit(key) : ");
        int key=in.nextInt();
        int count =0;
        while(n>0)
        {
            int remainder=n%10;// Remainder is used to get the last digit
            if(remainder==key)// Comparing the last digit with key
            {
                count++;
            }
            n=n/10; // Removing the last digit of that number
        }
        System.out.println("The number of Occurences of " + key + " in " + num + " is "+ count);

    }
}
