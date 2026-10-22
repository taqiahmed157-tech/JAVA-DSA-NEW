// Q. Calculate compound interest.
package com.taqi;
import java.util.Scanner;
public class CompoundInterest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principal : ");
        float p = in.nextFloat();
        System.out.print("Enter annual interest rate :");
        float r = in.nextFloat();
        System.out.print("Enter time in years : ");
        float t = in.nextFloat();
        double amount=p*Math.pow((1+r/100),t);//amount a = p((1+r/100)^t)
        double interest = amount-p;
        System.out.println("Compund interest earned : "+interest);
        System.out.print("Total Amount:"+amount);


    }

}
