package com.taqi;

import java.util.Scanner;

public class Largest {
    public static void main() {
        /*Q. Take three numbers input from user then find maximum
        number among those three.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers a,b and c : ");
        float a, b, c;
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();
        //General Method:-
        float max=a;
        if(b>max)
        {
            max=b;
        }
        if(c>max)
        {
            max=c;
        }
        System.out.println("Using General Method : "+max + " is the largest");

        // Logical Operators Method:-
        System.out.print("Using logical opeartor Method : ");
        if(a>b && a>c)
        {
            System.out.println(a+" is the largest");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+" is the largest");
        }
        else
        {
            System.out.println(c+" is the largest");
        }


    }
}