/* Q. Write a program to print the sum of negative numbers, sum of positive even numbers
and the sum of positive odd numbers from a list of numbers (N) entered by the user.
The list terminates when the user enters a zero.*/
package com.taqi;
import java.util.Scanner;
public class IntegerSum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num;
        int pos_even_sum=0;
        int neg_sum=0;
        int pos_odd_sum=0;

        while(true)
        {
            System.out.print("Enter next number : ");
            num=in.nextInt();
            if(num==0)//If the number is zero then break and exit
                break;
            else if(num>0)
            {
                if(num%2==0)// checking if the number is even then adding pos even sum.
                    pos_even_sum+=num;
                else
                    pos_odd_sum+=num;
            }
            else//if the number is neither positive nor zero then it will be negative
                neg_sum+=num;
        }
        System.out.println("Positive Even Sum : "+pos_even_sum);
        System.out.println("Positive Odd Sum : "+pos_odd_sum);
        System.out.print("Negative Sum : "+neg_sum);
    }
}
