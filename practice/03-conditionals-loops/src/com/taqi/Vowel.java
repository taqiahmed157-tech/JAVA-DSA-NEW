// Q. program to check vowel or consonant
package com.taqi;
import java.util.Locale;
import java.util.Scanner;
public class Vowel
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        char ch;
        System.out.print("Enter a character : ");
        ch = in.next().toLowerCase().trim().charAt(0);
        if(ch == ('a') || ch == ('e') || ch == ('i') || ch == ('o') || ch == ('u'))
        {
            System.out.println(ch+" is vowel");
        }
        else
            System.out.print(ch+" is consonant");

    }
}
