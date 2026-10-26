package com.taqi;
import java.util.Scanner;
public class Arguments
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int ans=sum(3,4);
        System.out.println(ans);
        String name;
        System.out.print("Enter your name : ");
        name=in.next();
        String message=greet(name);
        System.out.println(message);

    }

    private static String greet(String name)
    {
        String message="hello "+name;
        return message;
    }

    // pass the value of the numbers when you call the function
    static int sum(int a,int b)
    {
        int ans=a+b;
        return ans;
    }
}
