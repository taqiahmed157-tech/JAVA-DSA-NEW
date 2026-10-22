// Q. Write a program to check a number is armstrong or not.
package com.taqi;
import java.util.Scanner;
public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check armstrong : ");
        int n = in.nextInt();
        int temp=n,num=n;// storing original value to num and for counting(temp)
        int digits=0;//to count the number of digits
        // To count the number of digits
        while(temp>0)
        {
            digits++;
            temp=temp/10;
        }
        temp=n;
        int sum=0,power;
        while(temp>0)
        {
            int rem=temp%10;//Get the last digit
            power=1;
            //calculating rem^count using for loop
            for(int i=1;i<=digits;i++)
            {
                power=power*rem;//reamainder is multiplying with itself with digits time
            }
            sum=sum+power;//Adding the power terms
            temp=temp/10;
        }
        if(sum==num)
            System.out.println(num+" is Armstrong");
        else
            System.out.println(num+" is not Armstrong");
    }
}
