package com.taqi;
import java.util.Scanner;
public class HCF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter  first number : ");
        int a = in.nextInt();
        System.out.print("Enter  first number : ");
        int b = in.nextInt();
        int i;
        if(a<b)
            i=a;
        else
            i=b;
        // Check possible factor from higher to lower
        while(i>0)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.println(i);
                break;// after finding the first highest factor it will break
            }
            i--;

        }


    }
}
