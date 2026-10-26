package com.taqi;
import java.util.Scanner;
public class Swap
{
    public static void main()
    {
        /* Swap code
        int temp=a;
        a=b;
        b=temp;*/
        int a=10,b=20;
        System.out.println("Before Swapping : a= "+a+", b = "+b);
        swap(a,b);
        System.out.println("After Swapping : a = "+a+", b = "+b);
    }
    static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
        // This change is only valid in this function scope only
    }
}
