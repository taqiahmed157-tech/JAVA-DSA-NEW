package com.taqi;

import java.util.Scanner;
public class CaseCheck
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = in.next().trim().charAt(0);
        if(ch>='a'&& ch<='z')
        {
            System.out.println("Lowercase(Small)");
        }
        else
        {
            System.out.println("Uppercase(Capital)");
        }

    }
}
