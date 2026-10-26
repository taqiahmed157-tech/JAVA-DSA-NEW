package com.taqi;
import java.util.Scanner;
public class Vote
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age=in.nextInt();
        vote(age);
        System.out.println();
    }
    static void vote(int age)
    {
        if(age>18)
            System.out.println("Can vote");
        else
            System.out.println("Cannot vote");
    }
}
