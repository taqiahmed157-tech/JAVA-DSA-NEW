package com.taqi;

import java.util.Scanner;

public class Caclulator
{
    public static void main(String[] args)
    {
        int ans=0;
        Scanner in = new Scanner(System.in);
        // Taking input from user till user does not press x or X
        while(true)
        {
            //Taking char as input
            System.out.print("Enter Operator : ");
            char op=in.next().trim().charAt(0);
            System.out.println();
            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%')
            {
                System.out.print("Enter two numbers : ");
                int num1=in.nextInt();
                int num2=in.nextInt();
                if(op=='+')
                {
                    ans=num1+num2;
                }
                if(op=='-')
                {
                    ans=num1-num2;
                }
                if(op=='*')
                {
                    ans=num1*num2;
                }
                if(op=='/')
                {
                    if(num2==0)
                    {
                        System.out.println("Zero Division Error!!");
                    }
                    else
                    {
                        ans=num1/num2;
                    }
                }
                if(op=='%')
                {
                    ans=num1%num2;
                }
            }
            else if(op=='x' || op=='X')
            {
                break;
            }
            else
            {
                System.out.println("Invalid Operator!!");
            }
                System.out.println(ans);
        }

    }
}
