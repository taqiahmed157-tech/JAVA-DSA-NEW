package com.taqi;

import java.util.Scanner;
public class Arithmetic
{
    public static void main()
    {
        float num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        num1 = input.nextFloat();
        System.out.print("Enter 2nd number : ");
        num2= input.nextFloat();
        float sum=num1+num2;
        System.out.println("sum="+sum);
        float product = num1*num2;
        float remainder= num1%num2;
        System.out.println("product = "+ product);
        System.out.println("remainder = "+ remainder);



    }
}
