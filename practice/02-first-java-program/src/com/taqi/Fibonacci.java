package com.taqi;// Q. To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        // Fibonacci:0,1,1,2,3,5,8,13,........
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the nth Fibonacci term to display : ");
        int n=in.nextInt();
        int count=2;
        int curr=1,prev=0;
        if(n<=0)
        {
            System.out.println("Negative term is not valid in Fibonacci!!");
            return;
        }
        if(n==1)
            System.out.println(n+"th Fibonacci term : ");
        while(count<=n)
        {            int temp = curr;// Stores current value

            curr=curr+prev;// Calculates next fibonacci number
            prev=temp;// Moves previous to current(forward)
            count++;

        }
        System.out.print(n+"th Fibonacci term : "+curr);
    }
}
