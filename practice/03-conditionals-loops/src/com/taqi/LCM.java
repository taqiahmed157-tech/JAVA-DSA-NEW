package com.taqi;
import java.util.Scanner;
public class LCM
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a=in.nextInt();
        System.out.print("Enter second number : ");
        int b=in.nextInt();
        int i;
        if(a>b)
            i=a;
        else
            i=b;
        //Check factors from lower to higher
        while(true)
        {
            if(i%a==0&&i%b==0)// check whether the largest divides a and b
            {
                System.out.println(i);
                break;
            }
            i++;
        }

    }
}
