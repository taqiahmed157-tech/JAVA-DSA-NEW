// Make a sum method.
package com.taqi;
import java.util.Scanner;
/* Syntax to make method
        return_type name()
        {
            //Body
            return statement;
        }
*/
public class Sum
{
    public static void main(String[] args)
    {
        sum();
        System.out.println("Sum using return type as int : ");
        int ans = sum2();
        System.out.println(sum2());


    }
    static void sum()
    {
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter first numbe : ");
        num1=in.nextInt();
        System.out.print("Enter second number : ");
        num2 = in.nextInt();
        sum=num1+num2;
        System.out.println("Sum using void type : "+sum);
    }
    // Returning the value using return type as int
    static int sum2()
    {
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter first numbe : ");
        num1=in.nextInt();
        System.out.print("Enter second number : ");
        num2 = in.nextInt();
        sum=num1+num2;
        return sum;
        //System.out.println("This will never execute");
    }
}
