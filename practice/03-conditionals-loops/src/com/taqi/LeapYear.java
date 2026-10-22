// Q. Write a program to check whether an year is leap year or not.
package com.taqi;
import java.util.Scanner;
public class LeapYear
{
    public static void main(String[] args)
    {
        // A year is leap if it is divisible by 400 or divisible by 4 but not divisible by 100
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = in.nextInt();
        if(year%400==0 || (year%4==0 && year%100!=0))
        {
            System.out.print(year+" is a leap year");
        }
        else
            System.out.print(year+" is not a leap year");
    }
}
