package com.taqi;

public class Shadowing
{
    static int x=90;//This will be shadowed at line 11.
    public static void main(String[] args)
    {
        System.out.println(x);// 90
        int x;
        //System.out.println(x);// Error:variable x might not have been initialized
        x=40;//40
        System.out.println(x);//40
        fun();
    }
    static void fun()
    {
        System.out.println(x);//90
    }
}
