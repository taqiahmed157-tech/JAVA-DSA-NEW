// Q.Print all three digit armstrong number.
package com.taqi;
import java.util.Scanner;
public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=in.nextInt();
        int org=n;
        System.out.println(isArmstrong(n));
        for(int i=100;i<1000;i++)
        {
            if(isArmstrong(i))
                System.out.println(i+ " ");

        }


    }
    static boolean isArmstrong(int n)
    {
        int org=n;
        int sum = 0, cube = 0;
        while (n > 0)
        {
            int rem = n % 10;
            cube = rem * rem * rem;
            sum += cube;
            n=n/10;
        }
        return sum==org;
    }
}
