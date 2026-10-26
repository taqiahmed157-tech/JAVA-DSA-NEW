package com.taqi;
import java.util.Scanner;
public class Vote
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age : ");
        int n=in.nextInt();
        if(vote(n))
            System.out.println("Can vote");
        else
            System.out.println("Cannot vote");
    }
    static boolean vote(int n)
    {
        if(n>18)
            return true;
        return false;
    }
}
