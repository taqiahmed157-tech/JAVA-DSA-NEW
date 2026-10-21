package com.taqi;

import java.util.Scanner;
public class TypeConversion
{

    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        float num = input.nextFloat();
        System.out.println(num);
        // If we do float to int it will work instead we do type casting(manually)
        // If we do int to float it wil give us an error
        // Type Casting
        int n=(int)(64.78f);
        System.out.println(n);
        // Automatic type promotion in Expressions
        int a = 258;
        byte b = (byte)(a);//258%256=2(max value of byte is 256)
        System.out.println(b);
        //Example:-


    }
}
